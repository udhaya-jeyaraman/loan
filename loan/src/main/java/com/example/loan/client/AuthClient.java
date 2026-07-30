package com.example.loan.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name="auth-service",
        url="${application.config.auth-url}"
)
public interface AuthClient {
@GetMapping("/{auth-id}")
optional<AuthResponse>findCustomerById(@PathVariable("auth-id") Long authId);

}
