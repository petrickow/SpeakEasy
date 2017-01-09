package no.taco.speakeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpeakEasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeakEasyApplication.class, args);

	}
}
