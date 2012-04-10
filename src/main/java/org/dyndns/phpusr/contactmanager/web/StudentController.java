package org.dyndns.phpusr.contactmanager.web;

import org.dyndns.phpusr.contactmanager.entity.Student;
import org.dyndns.phpusr.contactmanager.service.StudentService;
import org.dyndns.phpusr.contactmanager.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author phpusr
 *         Date: 07.04.12
 *         Time: 21:34
 */

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(Constants.PAGE_STUDENT)
    public String getStudents(Map<String, Object> map) {
        map.put("student", new Student());
        map.put("studentList", service.getStudents());
        map.put(Constants.PAGE, Constants.PAGE_STUDENT);

        return Constants.PAGE_TEMPLATE;
    }

    @RequestMapping(Constants.PAGE_INDEX)
    public String home() {
        return "redirect:" + Constants.MAP_STUDENT;
    }

    @RequestMapping(value = Constants.PAGE_ADD_STUDENT, method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student, BindingResult result) {

        service.addStudent(student);

        return "redirect:" + Constants.MAP_STUDENT;
    }

    @RequestMapping(Constants.PAGE_DEL_STUDENT + "?{" + Constants.PARAM_DEL_STUDENT + "}")
    public String deleteStudent(@RequestParam(Constants.PARAM_DEL_STUDENT) Integer studentId) {
        final Student student = service.getStudentById(studentId);
        service.removeStudent(student);

        return "redirect:" + Constants.MAP_STUDENT;
    }

    @RequestMapping(Constants.MAP_LOGIN)
    public String template(Map<String, Object> map) {
        map.put(Constants.PAGE, Constants.PAGE_LOGIN);

        return Constants.PAGE_TEMPLATE;
    }
}
