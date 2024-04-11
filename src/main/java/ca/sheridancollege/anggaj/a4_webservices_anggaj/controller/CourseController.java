package ca.sheridancollege.anggaj.a4_webservices_anggaj.controller;

import ca.sheridancollege.anggaj.a4_webservices_anggaj.beans.Course;
import ca.sheridancollege.anggaj.a4_webservices_anggaj.repository.DatabaseAccess;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private DatabaseAccess da;

    public CourseController(DatabaseAccess da){
        this.da = da;
    }

    // Get all courses
    @GetMapping
    public List<Course> getCourseCollection() { return da.findAll(); }

    // Get course
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id) { return da.findById(id).get(); }

    // Create course
    @PostMapping(consumes = "application/json")
    public String postCourse(@RequestBody Course course) {
        return "http://localhost:8080/courses/" + da.save(course);
    }

    // Update course
    @PutMapping("/{id}")
    public String putCourse(@RequestBody Course course, @PathVariable Long id) {
        course.setId(id);
        return "http://localhost:8080/courses/" + da.save(course);
    }

    // Delete course
    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {
        da.deleteById(id);
        return "http://localhost:8080/courses/";
    }
}
