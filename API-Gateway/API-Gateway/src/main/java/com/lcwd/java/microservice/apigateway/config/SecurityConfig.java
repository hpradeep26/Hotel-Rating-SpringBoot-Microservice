package com.lcwd.java.microservice.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.RedirectServerLogoutSuccessHandler;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;
import org.springframework.stereotype.Component;

@Component
@EnableWebFluxSecurity
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity  http) {
		http
			.authorizeExchange(exchange -> exchange
					.pathMatchers("/auth/**").permitAll()
					.anyExchange().authenticated())
			.oauth2Login(Customizer.withDefaults())
			.logout(Customizer.withDefaults());
		return http.build();

	}
}
