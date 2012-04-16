package org.dyndns.phpusr.contactmanager.service;

import org.dyndns.phpusr.contactmanager.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author phpusr
 *         Date: 10.04.12
 *         Time: 21:24
 */

@Service("hello")
public class StudentServiceTestImpl implements StudentService {
    public static final String PREFIX = ">>";

    public void addStudent(Student student) {
        System.out.println(PREFIX + "Adding student: " + student);
    }

    public List<Student> getStudents() {
        System.out.println(PREFIX + "Getting students");
        return null;
    }

    public void removeStudent(Student student) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Student getStudentById(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
