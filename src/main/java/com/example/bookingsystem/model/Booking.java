package com.example.bookingsystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // L'utente che ha effettuato la prenotazione

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource; // La risorsa prenotata

    @Column(nullable = false)
    private LocalDate startDate; // Data di inizio della prenotazione

    @Column(nullable = false)
    private LocalDate endDate; // Data di fine della prenotazione

    @Column(nullable = false)
    private double totalPrice; // Prezzo totale della prenotazione

    // Costruttore vuoto (necessario per JPA)
    public Booking() {
    }

    // Costruttore con parametri
    public Booking(User user, Resource resource, LocalDate startDate, LocalDate endDate, double totalPrice) {
        this.user = user;
        this.resource = resource;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
