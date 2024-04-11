package ca.sheridancollege.anggaj.a4_webservices_anggaj.beans;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name="COURSE")
@Data
@NoArgsConstructor
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long Id;

    @Column(name="COURSE_NAME")
    private String courseName;

    @Column(name="COURSE_CODE")
    private String courseCode;

    @Column(name="COURSE_CREDIT")
    private String courseCredit;
}
