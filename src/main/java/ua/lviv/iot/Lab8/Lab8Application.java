package ua.lviv.iot.Lab8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(AttractionRepocitoriy attractionRepocitoriy){
		return (args) -> {
			attractionRepocitoriy.save(new Attraction(100, 3, DangerLevel.HIGH));
			attractionRepocitoriy.save(new Attraction(120, 20, DangerLevel.LOW));
			attractionRepocitoriy.save(new Attraction(150.50, 20, DangerLevel.MAXIMUM));
		};
	}
}
