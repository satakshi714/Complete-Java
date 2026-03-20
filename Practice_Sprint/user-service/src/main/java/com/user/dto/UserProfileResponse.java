package com.user.dto;

public class UserProfileResponse {

    private String email;
    private String fullName;
    private String role;
    private String phone;
    private String bio;
    private String skills;
    private String location;

    public UserProfileResponse() {}

    public UserProfileResponse(String email, String fullName, String role,
                               String phone, String bio, String skills, String location) {
        this.email = email;
        this.fullName = fullName;
        this.role = role;
        this.phone = phone;
        this.bio = bio;
        this.skills = skills;
        this.location = location;
    }

    public String getEmail() { return email; }
    public String getFullName() { return fullName; }
    public String getRole() { return role; }
    public String getPhone() { return phone; }
    public String getBio() { return bio; }
    public String getSkills() { return skills; }
    public String getLocation() { return location; }
}