package com.ideas2it.studentservice.service;

import java.util.List;

import com.ideas2it.studentservice.model.Student;

/**
 * <p>
 * The StudentService interface provides methods for communication
 * with database for performing CRUD operations
 * </p>
 * 
 * @author karthik created on 31 October
 *
 */
public interface StudentService {
	
	/**
	 * <p>
	 * It returns a list of students
	 * </p>
	 * @return - A list of students
	 */
	List<Student> getAllStudents();
	
	/**
	 * <p>
	 * It retries a particular student by Id
	 * </p>
	 * @param id
	 * @return
	 */
	Student getStudentById(Long id) ;
	
	/**
	 * <p>
	 * It saves a student information
	 * </p>
	 * @param student - The student detail to be saved
	 * @return The saved student detail
	 */
	Student saveStudent(Student student) ;
	
	/**
	 * <p>
	 * It updates the student details of a particular student
	 * </p>
	 * @param student The student with new details
	 * @return - The updated student detail
	 */
	Student updateStudent(Student student) ;
	
	/**
	 * <p>
	 * It deletes a particular student detail from database
	 * @param id - The Id of student to be deleted 
	 */
	void deleteStudentById(Long id) ;
}