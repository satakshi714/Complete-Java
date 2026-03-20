package com.user.controller;

import com.user.dto.CreateProfileRequest;
import com.user.dto.UserProfileResponse;
import com.user.security.JwtUtil;
import com.user.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    private String extractToken(HttpServletRequest request) {
        String header = request.getHeader("Authorization");

        if (header == null || !header.startsWith("Bearer ")) {
            throw new RuntimeException("Missing token");
        }

        return header.substring(7);
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @PostMapping("/profile")
    public UserProfileResponse createProfile(@RequestBody CreateProfileRequest request,
                                             HttpServletRequest httpRequest) {

        String token = extractToken(httpRequest);
        String email = JwtUtil.extractEmail(token);
        String role = JwtUtil.extractRole(token);

        return service.createProfile(email, role, request);
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/me")
    public UserProfileResponse getMyProfile(HttpServletRequest httpRequest) {

        String token = extractToken(httpRequest);
        String email = JwtUtil.extractEmail(token);

        return service.getMyProfile(email);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin/{email}")
    public UserProfileResponse getUser(@PathVariable String email) {
        return service.getUserByEmail(email);
    }
}