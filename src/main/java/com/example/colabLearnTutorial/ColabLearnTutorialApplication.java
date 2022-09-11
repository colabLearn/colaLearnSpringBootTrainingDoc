package com.example.colabLearnTutorial;
import com.example.colabLearnTutorial.domain.Car;
import com.example.colabLearnTutorial.domain.CarRepository;
import lombok.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColabLearnTutorialApplication  implements
		CommandLineRunner {
	//Logs and Problem solving
	private static final Logger logger =
			LoggerFactory.getLogger(ColabLearnTutorialApplication.class);

	@Autowired
	private CarRepository carRepository;
	public static void main(String[] args) {
		// After adding this comment the application should restart

		SpringApplication.run(ColabLearnTutorialApplication.class, args);
		//logger.info("Application started");
	}
	@Override
	public void run (String...args) throws Exception {
		//Place your code here
		carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000));
		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000));

		for (Car car :carRepository.findAll()){
			logger.info(car.getBrand() +" " + car.getModel());
		}

	}


}
