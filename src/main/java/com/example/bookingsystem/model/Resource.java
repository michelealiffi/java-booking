package com.example.bookingsystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "resources")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // Nome della risorsa (ad esempio "Stanza 101")

    private String description; // Descrizione della risorsa

    @Column(nullable = false)
    private double pricePerNight; // Prezzo per notte

    @OneToMany(mappedBy = "resource")
    private List<Booking> bookings; // Lista delle prenotazioni associate alla risorsa

    // Costruttore vuoto (necessario per JPA)
    public Resource() {
    }

    // Costruttore con parametri
    public Resource(String name, String description, double pricePerNight) {
        this.name = name;
        this.description = description;
        this.pricePerNight = pricePerNight;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
