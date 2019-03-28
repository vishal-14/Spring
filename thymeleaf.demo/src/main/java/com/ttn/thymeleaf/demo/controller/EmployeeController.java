package com.ttn.thymeleaf.demo.controller;

import com.ttn.thymeleaf.demo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class EmployeeController {
    /*
     * Question 3
     * Create an Employee registration form and
     * bind it's requested values on the controller.
     * registrationForm.html in templates.
     * */
    @GetMapping("/registrationForm")
    public String registrationForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "registrationForm";
    }
    /* registered.html in templates*/
    @PostMapping("/registrationForm")
    public ModelAndView registered(@ModelAttribute Employee employee) {
        ModelAndView modelAndView = new ModelAndView("registered");
        modelAndView.addObject("firstName", employee.getFirstName());
        modelAndView.addObject("lastName", employee.getLastName());
        return modelAndView;
    }

    /*
     * Question 4
     * Create a dynamic HTML page and
     * render an Employee table with emp object return from the controller
     * table.html in templates
     * */
    @GetMapping("/table")
    public String listEmployees(Model model) {
        model.addAttribute("employeeList", Arrays.asList(new Employee("Tony", "Stark"), new
                Employee("Steve", "Rogers")));
        return "table";
    }
}
