package io.bootify.ticket_app.domain; // Defines the package for domain models in the application

// Importing necessary annotations for JPA and Lombok functionality
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Marks this class as a JPA entity, meaning it maps to a database table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  Integer status;
}
