package com.authentication.service;

import com.authentication.dto.AuthResponse;
import com.authentication.dto.LoginRequest;
import com.authentication.dto.RegisterRequest;
import com.authentication.entity.User;
import com.authentication.exception.UserAlreadyExistsException;
import com.authentication.repository.UserRepository;
import com.authentication.security.JwtUtil;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // Constructor Injection
    public AuthServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AuthResponse register(RegisterRequest request) {

        // 1. Check duplicate email
    	if (userRepository.findByEmail(request.getEmail()).isPresent()) {
    		throw new UserAlreadyExistsException("User already exists with this email");
    	}
        // 2. Create user
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());

        // 🔐 IMPORTANT: Encrypt password
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user.setRole(request.getRole());
        user.setActive(true);

        // 3. Save
        userRepository.save(user);

        return new AuthResponse("User registered successfully", null);
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = JwtUtil.generateToken(user.getEmail(), user.getRole().name());

        return new AuthResponse("Login successful", token);
    }
}