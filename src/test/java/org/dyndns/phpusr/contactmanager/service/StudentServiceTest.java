package org.dyndns.phpusr.contactmanager.service;

import org.dyndns.phpusr.contactmanager.entity.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author phpusr
 *         Date: 09.04.12
 *         Time: 22:46
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/root-context.xml"})
public class StudentServiceTest {

    @Autowired
    @Qualifier("hello")
    StudentService service;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddStudent() throws Exception {
        service.addStudent(new Student("Ivan", "FuckOff", "Linkin Park"));
    }

    @Test
    public void testGetStudents() throws Exception {
        service.getStudents();
    }

    @Test
    public void testRemoveStudent() throws Exception {

    }

    @Test
    public void testGetStudentById() throws Exception {

    }
}
