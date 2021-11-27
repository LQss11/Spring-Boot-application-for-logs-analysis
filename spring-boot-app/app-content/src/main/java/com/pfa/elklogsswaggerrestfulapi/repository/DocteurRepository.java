package com.pfa.elklogsswaggerrestfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elklogsswaggerrestfulapi.model.Docteur;


public interface DocteurRepository extends JpaRepository <Docteur, Long> {
}
