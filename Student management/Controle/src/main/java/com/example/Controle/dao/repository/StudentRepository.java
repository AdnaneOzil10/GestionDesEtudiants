package com.example.Controle.dao.repository;

import com.example.Controle.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
