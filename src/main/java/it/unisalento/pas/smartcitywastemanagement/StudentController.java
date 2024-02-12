package it.unisalento.pas.smartcitywastemanagement;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping
    public List<Student> fetchAllStudents(){
        return studentService.getAllStudents();


    }
}
