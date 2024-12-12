package io.bootify.ticket_app.model;

// Import necessary validation annotations for input validation
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AdminDTO {

    private Long id; // The unique identifier for the Admin. No validation applied.

    @NotNull
    @Size(max = 255)
    private String name;

}
