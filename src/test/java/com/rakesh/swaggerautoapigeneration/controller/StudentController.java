package com.rakesh.swaggerautoapigeneration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.swaggerautoapigeneration.api.StudentApi;
import com.rakesh.swaggerautoapigeneration.model.Student;


@RestController
public class StudentController implements StudentApi{

	@Override
    public ResponseEntity<Student> getStudentDetail(String studentId) {
        // get student data from service layer
        Student student = new Student();
        student.setId(1);
        student.setName("rakesh");
        student.setAge(10);
        ResponseEntity<Student> responseEntity = ResponseEntity.ok(student);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Student> createStudentDetail(Student student) {
        // create student record in DB and return same
        return ResponseEntity.ok(student);
    }
}
