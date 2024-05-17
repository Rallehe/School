package se.yrgo.building.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Building {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Building name cannot be null")
    private String name;
    @NotNull(message = "Apartments cannot be null")
    @ElementCollection
    private List<Long> apartments;

    @ElementCollection
    private List<Long> guests;

    private Long janitorId;


    public Building(String name, List<Long> apartments, List<Long> guests, Long janitorId) {
        this.name = name;
        this.apartments = apartments;
        this.guests = guests;
        this.janitorId = janitorId;
    }

    public Building() {

    }

    public Long getId() {
        return id;
    }

    public Long getJanitorId() {
        return janitorId;
    }

    public void setJanitorId(Long janitorId) {
        this.janitorId = janitorId;
    }

    public List<Long> getApartments() {
        return apartments;
    }

    public void setApartments(List<Long> apartments) {
        this.apartments = apartments;
    }

    public List<Long> getGuests() {
        return guests;
    }

    public void setGuests(List<Long> guests) {
        this.guests = guests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
