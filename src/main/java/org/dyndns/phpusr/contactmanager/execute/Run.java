package org.dyndns.phpusr.contactmanager.execute;

import org.dyndns.phpusr.contactmanager.entity.Student;
import org.dyndns.phpusr.contactmanager.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author Sergey Doronin
 *         Date: 16.04.12
 *         Time: 17:35
 */
public class Run {

    public static void main(String[] args) {
        File file = new File("");

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("src/main/java/webapp/WEB-INF/resources/spring/root-context.xml");

        StudentService studentDao = (StudentService)appContext.getBean("studentDaoDefault");
        studentDao.addStudent(new Student("maloi", "sur", "Limp Bizkit"));

        System.out.println("Well Done!");
    }
}
