package com.user.service;

import com.user.dto.CreateProfileRequest;
import com.user.dto.UserProfileResponse;
import com.user.entity.UserProfile;
import com.user.exception.DuplicateResourceException;
import com.user.exception.ResourceNotFoundException;
import com.user.repository.UserProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserProfileRepository repository;

    public UserServiceImpl(UserProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserProfileResponse createProfile(String email, String role, CreateProfileRequest request) {

    	if (repository.findByEmail(email).isPresent()) {
    	    throw new DuplicateResourceException("Profile already exists");
    	}

        UserProfile profile = new UserProfile();
        profile.setEmail(email);
        profile.setRole(role);
        profile.setFullName(request.getFullName());
        profile.setPhone(request.getPhone());
        profile.setBio(request.getBio());
        profile.setSkills(request.getSkills());
        profile.setLocation(request.getLocation());
        profile.setActive(true);

        repository.save(profile);

        return mapToResponse(profile);
    }

    @Override
    public UserProfileResponse getMyProfile(String email) {

        UserProfile profile = repository.findByEmail(email)
                .orElseThrow();

        return mapToResponse(profile);
    }

    @Override
    public UserProfileResponse getUserByEmail(String email) {

        UserProfile profile = repository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        return mapToResponse(profile);
    }

    // helper method
    private UserProfileResponse mapToResponse(UserProfile profile) {
        return new UserProfileResponse(
                profile.getEmail(),
                profile.getFullName(),
                profile.getRole(),
                profile.getPhone(),
                profile.getBio(),
                profile.getSkills(),
                profile.getLocation()
        );
    }
}