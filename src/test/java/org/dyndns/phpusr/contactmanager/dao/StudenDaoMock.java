package org.dyndns.phpusr.contactmanager.dao;

import org.dyndns.phpusr.contactmanager.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author phpusr
 *         Date: 10.04.12
 *         Time: 21:16
 */

@Repository("StudentTestDao")
public class StudenDaoMock implements StudentDao {
    public void addStudent(Student student) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<Student> getStudents() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void removeStudent(Student student) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Student getStudentById(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
