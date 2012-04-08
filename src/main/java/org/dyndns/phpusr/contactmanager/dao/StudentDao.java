package org.dyndns.phpusr.contactmanager.dao;

import org.dyndns.phpusr.contactmanager.entity.Student;

import java.util.List;

/**
 * @author phpusr
 *         Date: 07.04.12
 *         Time: 20:16
 */
public interface StudentDao {

    void addStudent(Student student);

    List<Student> getStudents();

    void removeStudent(Student student);

    Student getStudentById(Integer id);
}
