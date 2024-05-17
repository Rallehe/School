package se.yrgo.apartment.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.apartment.domain.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
