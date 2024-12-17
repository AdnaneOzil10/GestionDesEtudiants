package com.example.Controle.service;

import com.example.Controle.dto.StudentDTO;

import java.util.List;

public interface StudentService {


    public StudentDTO saveStudent(StudentDTO studentDTO) ;
    public boolean deleteStudent(Integer id);

    public List<StudentDTO> getStudentById(Integer id);

    public List<StudentDTO> saveStudent(List<StudentDTO> studentDTOS);


}
