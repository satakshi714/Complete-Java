package com.user.service;

import com.user.dto.CreateProfileRequest;
import com.user.dto.UserProfileResponse;

public interface UserService {

    UserProfileResponse createProfile(String email, String role, CreateProfileRequest request);

    UserProfileResponse getMyProfile(String email);

    UserProfileResponse getUserByEmail(String email); // ADMIN use

}