package com.university.transcript.entity;

import java.time.LocalDateTime;

public class Student {
    private String studentId;
    private String fullName;
    private String email;
    private String gitHubUsername;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructor
    public Student(String studentId, String fullName, String email, String gitHubUsername, String role, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
        this.gitHubUsername = gitHubUsername;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // ... other getters and setters for remaining fields

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGitHubUsername() {
        return gitHubUsername;
    }

    public void setGitHubUsername(String gitHubUsername) {
        this.gitHubUsername = gitHubUsername;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}