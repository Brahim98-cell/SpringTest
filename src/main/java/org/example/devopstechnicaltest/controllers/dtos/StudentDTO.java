package org.example.devopstechnicaltest.controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class StudentDTO {

    private String id;

    private String first_name;

    private String family_name;

    private String email_address;
}
