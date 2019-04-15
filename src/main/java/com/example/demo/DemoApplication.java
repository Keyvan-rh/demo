package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController

public class DemoApplication {

	@GetMapping("/")
    public String welcome() {
        return "Greetings from Spring Boot!";
    }
    
    @GetMapping("/{input}")
    public String welcome(@PathVariable String input) {
        return "Greetings from Spring Boot to " + input;
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
