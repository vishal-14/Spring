package com.ttn.thymeleaf.demo.controller;

import com.ttn.thymeleaf.demo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class ApplicationController {
    /* Question 1
     * Create an external JS file and use it to show an alert on click of a button.
     * alert.js file in /resources/static/js
     * form.html file in /resources/templates
     * */
    @GetMapping("/form")
    public String form() {
        return "form";
    }

    /* Question 2
     * Create an external CSS file .
     * Use it to modify hello world page background color to grey.
     * style.css file in /resources/static/css
     * hello.html file in /resources/templates
     * */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    /*
     * Question 5
     * Show different custom greeting message based on the type of user.
     * For example, if the user is of type admin=true
     * then show "Hello Admin" message on Page else show "Hello User"
     * basis on isAdmin attribute value passed in model data.
     * greet.html in templates.
     *
     * Question 9 also called through greet
     * */
    @GetMapping("/greet")
    public String greet(Model model) {
        model.addAttribute("isAdmin", false);
        return "greet";
    }


    /*Question 7
     * Make a web page to show server time using ajax call.
     * */
    @GetMapping("/serverTime")
    public String serverTime() {
        return "serverTime";
    }

    @GetMapping("/getServerTime")
    @ResponseBody
    public LocalTime getServerTime() {
        return LocalTime.now();
    }

    /*Question 8
     * Create a user listing table show alternate row color using a conditional tag.
     * list.html in templates
     * */
    @GetMapping("/list")
    public String list(Model model) {
        List<String> users = Arrays.asList("Steve Rogers", "Bucky Barnes", "Scott Lang", "Tony Stark");
        model.addAttribute("list", users);
        return "list";
    }

    /*
     * Question 10
     * Add loader in registration form submission
     * which renders load till server return success form submission response.
     *
     * showLoader in static/js
     *
     */
    @GetMapping("/showLoader")
    public String showLoader() {
        return "registrationFormAjax";
    }

    @PostMapping("/registrationSubmit")
    @ResponseBody
    public String register(@ModelAttribute Employee employee) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Registered: " + employee.getFirstName() + "<br/>";
    }
}
