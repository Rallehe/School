package se.yrgo.janitor.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.janitor.domain.Janitor;

@Repository
public interface JanitorRepository extends JpaRepository<Janitor, Long> {

}
