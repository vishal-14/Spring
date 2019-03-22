package spring.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentNewController {
    /**
     * Question 3
     * Use annotation in StudentController to define a
     * default action index which renders a jsp page.
     */
    @RequestMapping("/")
    ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("indexDefault");
        return modelAndView;
    }
    /**
     * Question 4
     * Create one more annotation based action hello inside the StudentController
     * which uses @ResponseBody annotation from it to display Hello world.
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
    /**
     * Question 5
     * Create one more action which sends Model HelloWorld to the jsp file.
     */
    @RequestMapping("/helloWorld")
    ModelAndView helloWorld()
    {
        ModelAndView modelAndView = new ModelAndView("hello-world");
        modelAndView.addObject("greeting","Hello World!!!");
        return modelAndView;
    }

    /**
     * Question 6
     * Use @PathVariable annotation to access firstname and lastname in an action
     * inside StudentController place both the parameters in different arguments
     * and access them.
     */
    @RequestMapping("/name/{firstname}/{lastname}")
    @ResponseBody
    public String accessPathVariables(@PathVariable("firstname") String fName,@PathVariable("lastname") String lName){
        return "Hello, "+ fName + " "+lName;
    }

    /**
     * Question 7
     * Now place both the arguments inside a Map and access the Map instead
     */
    @RequestMapping("/firstnameAndLastname/{firstname}/{lastname}")
    @ResponseBody
    String accessPathVariablesFromMap(@PathVariable Map<String, String> requestMap) {
        return "Firstname: "+requestMap.get("firstname") + "\n"+ "Lastname: " + requestMap.get("lastname");
    }

    /**
     * Question 8
     * Use @RequestParam annotation to access the firstname and lastname
     * in formData action of StudentController.
     */
    @RequestMapping(value = "/input.html", method = RequestMethod.GET)
    ModelAndView input() {
        ModelAndView modelAndView = new ModelAndView("input");
        return modelAndView;
    }
    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("firstname") String username,
                      @RequestParam("lastname") String password) {
        return "Firstname: " + username + "<br>Lastname: " + password;
    }

    /**
     *Question 9
     *Create a StudentCO and bind firstname and lastname with
     * instance variable of StudentCO.
     */

    @RequestMapping(value = "/input1.html", method = RequestMethod.GET)
    ModelAndView input1() {
        ModelAndView modelAndView = new ModelAndView("input1");
        return modelAndView;
    }
    /**
     * Question 10
     * Use @ModelAttribute annotation to add Heading "Spring MVC Demo" in every model.
     */
    @ModelAttribute
    void addingObject(Model model) {
        model.addAttribute("heading", "Spring MVC Demo");
    }
    @RequestMapping(value = "/submitForm1.html", method = RequestMethod.POST)
    @ResponseBody
    /*String submitForm1(StudentCO studentCO) {
        return "Firstname: " + studentCO.getFirstname() + " <br>Lastname: " + studentCO.getLastname();
    }*/
    ModelAndView submitForm(@ModelAttribute("studentCO") StudentCO studentCO) {
        ModelAndView modelAndView = new ModelAndView("welcome-student");
        return modelAndView;
    }



}


