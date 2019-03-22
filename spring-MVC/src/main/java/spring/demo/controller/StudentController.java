package spring.demo.controller;
/**
 * Question 2
 * Use MultiActionController for StudentController which contains 2 actions
 * one action renders a jsp view and another action uses HttpServletResponse
 * to show the output on the Web browser.
 */

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentController extends MultiActionController {
   /*This action renders action-one.jsp*/
    public ModelAndView actionOne(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("action-one");
        return modelAndView;
    }
    /*This action uses httpServletResponse to print on browser window*/
    public void actionTwo(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>Action 2 from studentController</b>");
    }



}
