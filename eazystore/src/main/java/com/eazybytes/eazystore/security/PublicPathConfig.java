package com.eazybytes.eazystore.security;

import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PublicPathConfig {

    public List<String> publicPaths() {
        return List.of("/api/v1/products/**", "/api/v1/contacts/**");
    }
}
