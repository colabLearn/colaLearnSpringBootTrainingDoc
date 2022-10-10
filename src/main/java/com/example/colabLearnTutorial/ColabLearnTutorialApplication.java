package com.example.colabLearnTutorial;
import com.example.colabLearnTutorial.domain.*;
//import lombok.Builder;
import com.example.colabLearnTutorial.web.carController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;


@SpringBootApplication
public class ColabLearnTutorialApplication  implements
		CommandLineRunner {

	//Logs and Problem solving
	private static final Logger logger =
			LoggerFactory.getLogger(ColabLearnTutorialApplication.class);


	@Autowired
	private UserRepository useRepository;
	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;
	public static void main(String[] args) {
		// After adding this comment the application should restart

		SpringApplication.run(ColabLearnTutorialApplication.class, args);
		//logger.info("Application started");
	}


	@Override
	public void run (String...args) throws Exception {
		//Add owner objects and save these to db
		Owner owner1 = new Owner ("John", "Johnson");
		Owner owner2 = new Owner ("Mary", "Robinson");
		ownerRepository.saveAll(Arrays.asList(owner1,owner2));

		//Place your code here
		carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000, owner1));
		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000, owner2));
		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000, owner2));

		for (Car car :carRepository.findAll()){
			logger.info(car.getBrand() +" " + car.getModel());
		}

		//Username: user, password:user
		useRepository.save(new User("user","$2a$10$xc0N/I5AVgT6koM5PLK0NutZNfGVqyvCgN.DYEDyRIwz4LmDg8HbG", "USER"));

		//Username: admin, password: admin
		useRepository.save(new User("admin","$2a$10$..4kK81dknqSlfDQTQjSwuHHRfOLsOND6ceXYukHd0kzWbZzoHk7e", "ADMIN"));

	}




}
