package ca.sheridancollege.anggaj.a4_webservices_anggaj.repository;

import ca.sheridancollege.anggaj.a4_webservices_anggaj.beans.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DatabaseAccess extends JpaRepository<Course, Long> {
    List<Course> findCourseByCourseName(String name);
}
