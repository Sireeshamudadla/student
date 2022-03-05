package com.org.cts.srevice;

import com.org.cts.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentService {

    public void createStudent( Student student);

    public void updateStudent(Student student);

    public void deleteByStudentId(Integer id);

    public List<Student> getAllStudents();

}
