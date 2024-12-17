package com.example.Controle.mapper;

import com.example.Controle.dao.entities.Student;
import com.example.Controle.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component

public class StudentMapper {

    private ModelMapper Mapper = new ModelMapper();

    public Student fromStudentDtoToStudent(StudentDTO studentDTO) {
        return Mapper.map(studentDTO, Student.class);
    }

    public StudentDTO fromStudentToStudentDTO(Student student) {
        return Mapper.map(student, StudentDTO.class);
    }


}
