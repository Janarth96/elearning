package com.elearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.entity.AssignmentSubmission;

@Repository
public interface AssignmentRepository extends JpaRepository<AssignmentSubmission, Integer>{
    List<AssignmentSubmission> findByStudentId(Integer studentId);
}
