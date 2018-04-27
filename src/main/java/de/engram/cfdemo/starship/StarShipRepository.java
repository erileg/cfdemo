package de.engram.cfdemo.starship;

import org.springframework.data.repository.CrudRepository;

public interface StarShipRepository extends CrudRepository<StarShip, Long> {
    Iterable<StarShip> findByName(String name);
}
