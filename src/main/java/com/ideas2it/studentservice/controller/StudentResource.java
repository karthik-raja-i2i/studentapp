package com.ideas2it.studentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ideas2it.studentservice.model.Student;
import com.ideas2it.studentservice.StudentService;

/**
 * <p>
 * The StudentResource class acts as controller and resource for the student application
 * It directs the urls and provides the relevant data back to front end
 * </p>
 * 
 * @author karthik created on 31 October
 *
 */
@RestController
public class StudentResource {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * <p>
	 * It returns all the student details available
	 * </p>
	 * 
	 * @return students - The list of all students
	 */
	@GetMapping("/students/all")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	/**
	 * <p>
	 * It gets a particular student details by the student Id
	 * </p>
	 * 
	 * @param id - The Id of student required
	 * @return student - The student details for the particular Id
	 */
	@GetMapping("/students/get/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
		Student student = studentService.getStudentById(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	/**
	 * <p>
	 * It saves a new student detail in the database
	 * </p>
	 * 
	 * @param student - The student details provided by the user
	 * @return student - The student details with Id after being saved in database
	 */
	@PostMapping("/students/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	/**
	 * <p>
	 * It updates the student details
	 * </p>
	 * 
	 * @param student - The student whose details is to be changed
	 * @return student - The updated student details
	 */
	@PostMapping("/students/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	/**
	 * <p>
	 * It deletes a particular student detail based on student Id
	 * </p>
	 * 
	 * @param id - The Id of student to be deleted
	 * @return - A list of students after deletion
	 */
	@DeleteMapping("/students/delete/{id}")
	public ResponseEntity<List<Student>>  deleteStudentById(@PathVariable("id") Long id) {
		studentService.deleteStudentById(id);
		return getAllStudents();
	}
}