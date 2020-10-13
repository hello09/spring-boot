package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Main {

	@RequestMapping("/")
	String home() {
	return "Hello World!";
	}
	
	@RequestMapping("/hello")
	String hello() {
	return "Pranjali!";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class, args);

	}

}
