package com.example.Controle.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Student {

    @Id

    private Integer id_Student;
    private String name;
    private String email;
    private String dateNaissance;

}
