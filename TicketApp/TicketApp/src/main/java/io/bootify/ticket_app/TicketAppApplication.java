package io.bootify.ticket_app;

import org.springframework.boot.SpringApplication; // Importing the class to launch the Spring application
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importing the annotation for Spring Boot application setup

// The main class of the application, annotated as a Spring Boot application
@SpringBootApplication
public class TicketAppApplication {

    // The main method, serving as the entry point of the application
    public static void main(final String[] args) {
        SpringApplication.run(TicketAppApplication.class, args);
        System.out.println("hello");
    }

}
