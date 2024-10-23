package com.udea.flightsearch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String origin;
    private String destination;
    private LocalDate date;
    private Double price;
    private String classType;
    private String typeLuggage;
    private Integer numberPassengers;

    public Flight() { }

    public Flight(Long id, String origin, String destination, LocalDate date, double price, String classType, String typeLuggage, Integer numberPassengers) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.price = price;
        this.classType = classType;
        this.typeLuggage = typeLuggage;
        this.numberPassengers = numberPassengers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getTypeLuggage() {
        return typeLuggage;
    }

    public void setTypeLuggage(String typeLuggage) {
        this.typeLuggage = typeLuggage;
    }

    public Integer getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(Integer numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(id, flight.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
