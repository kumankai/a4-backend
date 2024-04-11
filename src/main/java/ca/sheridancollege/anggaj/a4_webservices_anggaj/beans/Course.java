package ca.sheridancollege.anggaj.a4_webservices_anggaj.beans;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name="STUDENT")
@Data
@NoArgsConstructor
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long Id;

    @Column(name="CourseName")
    private String courseName;

    @Column(name="CourseCode")
    private String courseCode;

    @Column(name="CourseCredit")
    private String courseCredit;
}
