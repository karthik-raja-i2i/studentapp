package com.ideas2it.studentservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas2it.studentservice.repository.StudentRepository;
import com.ideas2it.studentservice.model.Student;
import com.ideas2it.studentservice.service.StudentService;;

/**
 * <p>
 * The StudentService interface provides methods for communication
 * with database for performing CRUD operations
 * </p>
 * 
 * @author karthik created on 31 October
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	/**
	 * {@inheritDoc}
	 */
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Student getStudentById(Long id) {
		return studentRepository.getOne(id);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Student saveStudent(Student student) {
		Student newStudent = new Student();
		newStudent.setId(student.getId());
		newStudent.setName(student.getName());
		newStudent.setPassportNumber(student.getPassportNumber());
		return studentRepository.save(student);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Student updateStudent(Student student) {
		Student existingStudent = getStudentById(student.getId());
		existingStudent.setName(student.getName());
		existingStudent.setPassportNumber(student.getPassportNumber());
		return studentRepository.save(existingStudent);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}
}