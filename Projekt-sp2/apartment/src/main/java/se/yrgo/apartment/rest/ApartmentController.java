package se.yrgo.apartment.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.apartment.data.ApartmentNotFoundException;
import se.yrgo.apartment.domain.Apartment;
import se.yrgo.apartment.service.ApartmentService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8085")
@RestController
@RequestMapping("/apartments")
public class ApartmentController {
    private final ApartmentService apartmentService;

    @Autowired
    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping
    public List<Apartment> getAllApartments() {
        return apartmentService.getAllApartments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getApartmentById(@PathVariable("id") Long id) {
        try {
        Optional<Apartment> apartment = Optional.ofNullable(apartmentService.getApartmentById(id)
                .orElseThrow(() -> new ApartmentNotFoundException("Apartment not found with id: " + id)));
        return ResponseEntity.ok(apartment);
    }  catch (ApartmentNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


    @PostMapping("create-apartment")
    public ResponseEntity<Apartment> createNewApartment(@RequestBody Apartment apartment) {
        Apartment createdApartment = apartmentService.createNewApartment(apartment);
        return new ResponseEntity<>(createdApartment, HttpStatus.CREATED);
    }

    @PostMapping("delete-apartment")
    public void destroyApartment(@RequestBody Apartment apartmentToDestory) {
        apartmentService.destroyApartment(apartmentToDestory);
    }
}
