package com.university.transcript.repository;

public interface CourseRepository {
    // Save a course
    void save(Course course);
    
    // Find a course by its ID
    Course findById(Long id);
    
    // Find a course by its course code
    Course findByCourseCode(String courseCode);
    
    // Find all courses
    List<Course> findAll();
    
    // Find courses by semester
    List<Course> findBySemester(String semester);
    
    // Delete a course
    void delete(Long id);
    
    // Update a course
    void update(Course course);
}