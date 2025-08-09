package com.example.doctorsearch.controller;

import com.example.doctorsearch.model.Doctor;
import com.example.doctorsearch.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins = "*")
public class DoctorController {

    @Autowired
    private DoctorRepository repo;

    @GetMapping
    public ResponseEntity<?> list(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size,
            @RequestParam(value = "speciality", required = false) String speciality,
            @RequestParam(value = "location", required = false) String location,
            @RequestParam(value = "q", required = false) String q
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Doctor> paged = repo.search(speciality, location, q, pageable);
        return ResponseEntity.ok(paged);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        return repo.findById(id)
                .map(d -> ResponseEntity.ok(d))
                .orElse(ResponseEntity.notFound().build());
    }
}
