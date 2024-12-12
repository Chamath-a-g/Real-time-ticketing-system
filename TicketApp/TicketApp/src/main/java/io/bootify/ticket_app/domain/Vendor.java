package io.bootify.ticket_app.domain; // Defines the package for domain models in the application

// Importing necessary annotations and classes for JPA, auditing, and Lombok functionality
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;
import java.util.Set;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

// Marks this class as a JPA entity and maps it to a database table named "Vendors"
@Entity
@Table(name = "Vendors")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {

    // Custom constructor for initializing a Vendor object with just the name
    public Vendor(String name) {
        this.name = name;
    }

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "vendorId")
    private Set<Ticket> tickets;

    @Column
    private Integer totalTickets;

    @Column
    private Integer ticketReleaseRate;

    @Column
    private Integer maxTicketCapacity;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
