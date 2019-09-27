package com.asu.project7.controller;

import com.asu.project7.dto.StudentDTO;
import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sandbox")
@RestController
public class SandboxController {

    @Autowired
    private StudentRepository studentRepository;

}
