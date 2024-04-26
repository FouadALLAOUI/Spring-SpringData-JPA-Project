package com.riodan.SpringBootSpringDataJPA.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
public class Author {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;


}
