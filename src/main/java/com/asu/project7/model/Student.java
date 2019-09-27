package com.asu.project7.model;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @SequenceGenerator(name = "Student_id",sequenceName = "Student_Seq")
    @GeneratedValue(generator = "Student_id")
    @Column(name = "studentId")
    private Long studentId;
}
