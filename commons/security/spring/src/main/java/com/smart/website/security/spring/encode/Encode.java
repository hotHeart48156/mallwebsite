package com.smart.website.security.spring.encode;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author "yangbiao"
 * @create 2019122317:50
 */
public interface Encode {
    PasswordEncoder encoder(int password);

    PasswordEncoder encoder();
}
