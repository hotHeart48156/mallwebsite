package com.smart.website.security.spring.entrypoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * @author "yangbiao"
 * @date 2019122323:01
 */
public class AuthEntryPoint implements EntryPoint {
    @Autowired
    AuthenticationException authException;


    public static boolean isAjaxRequest(HttpServletRequest request) {
        String ajaxFlag = request.getHeader("X-Requested-With");
        return ajaxFlag != null && "XMLHttpRequest".equals(ajaxFlag);
    }

    @Override
    public AuthenticationEntryPoint commence() {
        AuthenticationEntryPoint entryPoint = new AuthenticationEntryPoint() {
            @Override
            public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                Map<String, Object> map = new HashMap<>();
                map.put("error", "401");
                map.put("message", authException.getMessage());
                map.put("path", httpServletRequest.getServletPath());
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                httpServletResponse.setContentType("application/json");
                httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                try {
                    ObjectMapper mapper = new ObjectMapper();
                    mapper.writeValue(httpServletResponse.getOutputStream(), map);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }


                if (isAjaxRequest(httpServletRequest)) {
                    httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
                } else {
                    httpServletResponse.sendRedirect("");
                }
            }
        };
        return entryPoint;
    }


}
