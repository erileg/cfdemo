package de.engram.cfdemo.starship;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;
import java.util.UUID;

public interface StarShipRepository extends CrudRepository<StarShip, UUID> {
    Set<StarShip> findByName(@Param("name") String name);
    Set<StarShip> findByNameContainingIgnoreCase(@Param("name") String name);
}
