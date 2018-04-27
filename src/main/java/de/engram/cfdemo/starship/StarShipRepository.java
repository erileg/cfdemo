package de.engram.cfdemo.starship;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface StarShipRepository extends CrudRepository<StarShip, Long> {
    Set<StarShip> findByName(@Param("name") String name);
    Set<StarShip> findByNameContainingIgnoreCase(@Param("name") String name);
}
