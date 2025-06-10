package com.gam.erp.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(org.springframework.security.config.web.server.ServerHttpSecurity http) {
        http
                .authorizeExchange(exchange -> exchange
                        .anyExchange().permitAll() // Cho phép tất cả
                )
                .csrf(csrf -> csrf.disable()) // Tắt CSRF
                .httpBasic(Customizer.withDefaults())
                .formLogin(login -> login.disable()); // Tắt form login

        return http.build();
    }
}
