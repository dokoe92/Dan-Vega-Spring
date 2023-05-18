package koeberl.dominik.at.contentcalendar;

import koeberl.dominik.at.contentcalendar.model.Content;
import koeberl.dominik.at.contentcalendar.model.Status;
import koeberl.dominik.at.contentcalendar.model.Type;
import koeberl.dominik.at.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content content = new Content( 1,
					"Hello Chat GPT",
					"All about gpt",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					""
			);
			repository.save(content);
		};
	}

}


