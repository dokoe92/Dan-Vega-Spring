package koeberl.dominik.at.contentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";




		SpringApplication.run(Application.class, args);


	}
}


