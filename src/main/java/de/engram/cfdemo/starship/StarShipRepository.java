package de.engram.cfdemo.starship;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StarShipRepository extends CrudRepository<StarShip, Long> {
    Iterable<StarShip> findByNameContainingIgnoreCase(@Param("name") String name);
}
