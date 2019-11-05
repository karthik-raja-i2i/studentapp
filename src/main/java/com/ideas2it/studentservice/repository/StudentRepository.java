package com.ideas2it.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ideas2it.studentservice.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {}