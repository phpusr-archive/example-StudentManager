package org.dyndns.phpusr.contactmanager.dao;

import org.dyndns.phpusr.contactmanager.entity.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author phpusr
 *         Date: 07.04.12
 *         Time: 20:18
 */

@Repository("studentDaoDefault")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @SuppressWarnings("unchecked")
    public List<Student> getStudents() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    public void removeStudent(Student student) {
        if (student != null) {
            sessionFactory.getCurrentSession().delete(student);
        }
    }

    public Student getStudentById(Integer id) {
        return (Student) sessionFactory.getCurrentSession().get(Student.class, id);
    }
}
