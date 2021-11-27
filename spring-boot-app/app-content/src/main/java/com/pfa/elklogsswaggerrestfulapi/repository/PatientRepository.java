package com.pfa.elklogsswaggerrestfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elklogsswaggerrestfulapi.model.Patient;



public interface PatientRepository extends JpaRepository <Patient, Long> {
}

