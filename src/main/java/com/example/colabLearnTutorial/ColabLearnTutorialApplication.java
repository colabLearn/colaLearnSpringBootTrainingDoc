package com.example.colabLearnTutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColabLearnTutorialApplication {
	//Logs and Problem solving
	private static final Logger logger =
			LoggerFactory.getLogger(ColabLearnTutorialApplication.class);

	public static void main(String[] args) {
		// After adding this comment the application should restart

		SpringApplication.run(ColabLearnTutorialApplication.class, args);
		logger.info("Application started");
	}

}
