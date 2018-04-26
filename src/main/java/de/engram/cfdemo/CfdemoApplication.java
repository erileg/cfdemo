package de.engram.cfdemo;

import de.engram.cfdemo.starship.StarShip;
import de.engram.cfdemo.starship.StarShipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CfdemoApplication {

	@Bean
	public CommandLineRunner demo(StarShipRepository starShipRepository) {
		return (args) -> {
			StarShip falcon = new StarShip();
			falcon.setName("Millennium Falcon");
			falcon.setModel("YT-1300f light freighter");
			falcon.setManufacturer("Corellian Engineering Corporationr");
			falcon.setSpeedMglt(75L);
			starShipRepository.save(falcon);

			StarShip tieFighter = new StarShip();
			tieFighter.setName("TIE Fighter");
			tieFighter.setModel("TIE/ln space superiority starfighter");
			tieFighter.setManufacturer("Sienar Fleet Systems");
			tieFighter.setSpeedMglt(42L);
			starShipRepository.save(tieFighter);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(CfdemoApplication.class, args);
	}
}
