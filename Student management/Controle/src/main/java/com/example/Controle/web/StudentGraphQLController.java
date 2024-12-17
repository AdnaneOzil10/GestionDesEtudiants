package com.example.Controle.web;

import com.example.Controle.dto.StudentDTO;
import com.example.Controle.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentGraphQLController {

    @Autowired
    private StudentService studentService;

    @MutationMapping
    public StudentDTO saveEtudiant(StudentDTO studentDTO) {
        return studentService.saveStudent(studentDTO);
    }
    @QueryMapping
    public List<StudentDTO> getStudentsById(@Argument Integer id) {
        return studentService.getStudentById(id);
    }

}
