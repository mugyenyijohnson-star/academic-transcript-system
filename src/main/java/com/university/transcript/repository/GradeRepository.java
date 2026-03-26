package com.university.transcript.repository;

import java.util.List;

public interface GradeRepository {
    void save(Grade grade);
    Grade findByStudentIdAndCourseCode(String studentId, String courseCode);
    List<Grade> findByStudentId(String studentId);
    List<Grade> findByCourseCode(String courseCode);
    List<Grade> findAll();
    void delete(String studentId, String courseCode);
    void update(Grade grade);
    List<Grade> findByStatus(String status);
}