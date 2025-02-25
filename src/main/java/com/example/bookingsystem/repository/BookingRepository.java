package com.example.bookingsystem.repository;

import com.example.bookingsystem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId); // Trova tutte le prenotazioni di un utente
    List<Booking> findByResourceId(Long resourceId); // Trova tutte le prenotazioni di una risorsa
}
