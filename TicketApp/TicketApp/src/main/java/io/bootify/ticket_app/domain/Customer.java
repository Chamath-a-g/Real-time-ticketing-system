package io.bootify.ticket_app.domain;

// Importing necessary annotations and classes for JPA, auditing, and Lombok functionality
import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


// Specifies that this class is a JPA entity and will be mapped to a database table
@Entity
@Table(name = "Customers")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    // Custom constructor for initializing the customer with a name only
    public Customer(String name) {
        this.name = name;
    }

    // Specifies the primary key field for the entity
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "customerId")
    private Set<Ticket> tickets;

    @Column
    private Integer totalTickets;

    @Column
    private Integer customerRetrievalRate;

    @Column
    private Integer maxTicketCapacity;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
