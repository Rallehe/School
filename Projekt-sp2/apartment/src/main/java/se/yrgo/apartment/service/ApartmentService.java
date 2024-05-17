package se.yrgo.apartment.service;

import se.yrgo.apartment.data.ApartmentNotFoundException;
import se.yrgo.apartment.domain.Apartment;

import java.util.List;
import java.util.Optional;

public interface ApartmentService {
    public Optional<Apartment> getApartmentById(Long id) throws ApartmentNotFoundException;
    public List<Apartment> getAllApartments();
    public Apartment createNewApartment(Apartment newApartment);
    public void destroyApartment(Apartment apartmentToDestory);
}
