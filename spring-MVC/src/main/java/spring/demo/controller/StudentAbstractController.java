package spring.demo.controller;

/**
 * Question 1
 * Implement AbstractController in StudentController.
 * Create a mapping index.html for it.
 * Render index.jsp view from it which displays messages "Hello from index.jsp"
 */

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentAbstractController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
