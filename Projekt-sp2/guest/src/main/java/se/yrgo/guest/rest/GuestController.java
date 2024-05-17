package se.yrgo.guest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import se.yrgo.guest.domain.Guest;
import se.yrgo.guest.service.GuestService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8085")
@RestController
@RequestMapping("/guests")
public class GuestController {
    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public List<Guest> getAllGuests() {return guestService.getAllGuests();
    }

    @PostMapping("/create-guest")
    public ResponseEntity<Guest> newGuest(@RequestBody Guest guest) {
        Guest addedNewGuest = guestService.newGuest(guest);
        return new ResponseEntity<>(addedNewGuest, HttpStatus.CREATED);
    }

    @PostMapping("/delete-guest")
    public void deleteGuest(@RequestBody Guest guest) {
        guestService.deleteGuest(guest);
    }
    
}
