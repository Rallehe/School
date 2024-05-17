package se.yrgo.guest.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.yrgo.guest.domain.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

}
