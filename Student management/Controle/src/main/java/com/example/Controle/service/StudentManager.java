package com.example.Controle.service;

import com.example.Controle.dao.entities.Student;
import com.example.Controle.dao.repository.StudentRepository;
import com.example.Controle.dto.StudentDTO;
import com.example.Controle.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentManager implements StudentService{

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;


    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDTO);
        student = studentRepository.save(student);
        studentDTO = studentMapper.fromStudentToStudentDTO(student);
        return studentDTO;
    }

    @Override
    public boolean deleteStudent(Integer id) {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<StudentDTO> getStudentById(Integer id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        List<StudentDTO> studentDTOS = new ArrayList<>();

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            studentDTOS.add(studentMapper.fromStudentToStudentDTO(student));
        }

        return studentDTOS;
    }

    @Override
    public List<StudentDTO> saveStudent(List<StudentDTO> studentDTOS) {
        List<Student> students = new ArrayList<>();

        // Map each StudentDTO to a Student
        for (StudentDTO studentDTO : studentDTOS) {
            students.add(studentMapper.fromStudentDtoToStudent(studentDTO));
        }

        // Save all Student entities
        students = studentRepository.saveAll(students);

        // Convert the saved Students back to StudentDTOs
        List<StudentDTO> savedStudentDTOS = new ArrayList<>();
        for (Student student : students) {
            savedStudentDTOS.add(studentMapper.fromStudentToStudentDTO(student));
        }

        return savedStudentDTOS;
    }

}


