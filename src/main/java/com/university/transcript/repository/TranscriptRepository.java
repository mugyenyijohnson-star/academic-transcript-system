package com.university.transcript.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.university.transcript.model.Transcript;

public interface TranscriptRepository extends JpaRepository<Transcript, Long> {

    // Method to find a transcript by student ID
    Transcript findByStudentId(Long studentId);

    // Method to delete a transcript by student ID
    void deleteByStudentId(Long studentId);

    // Method to find all transcripts
    List<Transcript> findAll();
}