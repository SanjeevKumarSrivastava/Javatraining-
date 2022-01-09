package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.demo.controller.TestController;

@SpringBootApplication
public class JavademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavademoApplication.class, args);
		
		TestController testController = new TestController();
		testController.mtTestMethod();
	}

}
