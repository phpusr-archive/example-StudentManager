package org.dyndns.phpusr.contactmanager.service;

import org.dyndns.phpusr.contactmanager.dao.StudentDao;
import org.dyndns.phpusr.contactmanager.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author phpusr
 *         Date: 07.04.12
 *         Time: 21:09
 */

@Service("studentServiceDefault")
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier("StudentTestDao")
    StudentDao dao;

    @Transactional
    public void addStudent(Student student) {
        dao.addStudent(student);
    }

    @Transactional
    public List<Student> getStudents() {
        return dao.getStudents();
    }

    @Transactional
    public void removeStudent(Student student) {
        dao.removeStudent(student);
    }

    @Transactional
    public Student getStudentById(Integer id) {
        return dao.getStudentById(id);
    }


}
