package se.yrgo.guest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import se.yrgo.guest.data.GuestRepository;
import se.yrgo.guest.domain.Guest;

@Service
public class GuestServiceImpl implements GuestService {

    private GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @Override
    public Guest newGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public void deleteGuest(Guest deleteGuest) {
        guestRepository.delete(deleteGuest);
    }

}
