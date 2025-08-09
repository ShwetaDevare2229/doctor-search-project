package com.example.doctorsearch.repository;

import com.example.doctorsearch.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Query("""
        SELECT d FROM Doctor d
        WHERE (:speciality IS NULL OR LOWER(d.speciality) LIKE LOWER(CONCAT('%', :speciality, '%')))
        AND (:location IS NULL OR LOWER(d.location) LIKE LOWER(CONCAT('%', :location, '%')))
        AND (:q IS NULL OR LOWER(d.name) LIKE LOWER(CONCAT('%', :q, '%')) OR LOWER(d.clinic) LIKE LOWER(CONCAT('%', :q, '%')))
        """)
    Page<Doctor> search(
        @Param("speciality") String speciality,
        @Param("location") String location,
        @Param("q") String q,
        Pageable pageable
    );
}
