package se.yrgo.apartment.service;

import org.springframework.stereotype.Service;
import se.yrgo.apartment.data.ApartmentNotFoundException;
import se.yrgo.apartment.data.ApartmentRepository;
import se.yrgo.apartment.domain.Apartment;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ApartmentServiceImpl implements ApartmentService{
    private final ApartmentRepository repository;

    public ApartmentServiceImpl(ApartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Apartment> getApartmentById(Long id) throws ApartmentNotFoundException {
        return repository.findById(id);
    }

    @Override
    public List<Apartment> getAllApartments() {
        return repository.findAll();
    }

    @Override
    public Apartment createNewApartment(Apartment newApartment) {
        return repository.save(newApartment);
    }

    @Override
    public void destroyApartment(Apartment apartmentToDestory) {
        repository.delete(apartmentToDestory);
    }
}
