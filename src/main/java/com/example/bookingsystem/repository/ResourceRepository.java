package com.example.bookingsystem.repository;

import com.example.bookingsystem.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    Optional<Resource> findById(Long id); // Per trovare una risorsa tramite ID
}
