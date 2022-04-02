package com.example.mvc_thymleaf.repo;

import com.example.mvc_thymleaf.Models.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    Page<Patient> findByNomContains(String key, Pageable pageable);
}
