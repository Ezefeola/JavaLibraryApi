package com.javalibraryapi.JavaLibraryApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class JavaLibraryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaLibraryApiApplication.class, args);
	}

}
