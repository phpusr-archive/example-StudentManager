package org.dyndns.phpusr.contactmanager.service;

import org.dyndns.phpusr.contactmanager.entity.Student;

import java.util.List;

/**
 * @author phpusr
 *         Date: 07.04.12
 *         Time: 21:08
 */
public interface StudentService {

    void addStudent(Student student);

    List<Student> getStudents();

    void removeStudent(Student student);

    Student getStudentById(Integer id);
}
