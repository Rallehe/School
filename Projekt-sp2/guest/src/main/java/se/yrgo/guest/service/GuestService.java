package se.yrgo.guest.service;

import java.util.List;

import se.yrgo.guest.domain.Guest;

public interface GuestService {
    
    List<Guest> getAllGuests();

    public Guest newGuest(Guest guest);

    public void deleteGuest(Guest deleteGuest);

}
