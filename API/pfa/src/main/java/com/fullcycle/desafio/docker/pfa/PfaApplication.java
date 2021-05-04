package com.fullcycle.desafio.docker.pfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class PfaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfaApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void initDataBase() {
	    System.out.println("hello world, I have just started up");
	}

}
