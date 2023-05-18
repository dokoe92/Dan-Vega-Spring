package koeberl.dominik.at.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Content(
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dataCreate,
        LocalDateTime dateUpdated,
        String url

) {

}
