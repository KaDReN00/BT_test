package com.example.bt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // Отключаем CSRF с использованием нового синтаксиса
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()  // Разрешаем доступ ко всем URL
                );
        return http.build();
    }
}
