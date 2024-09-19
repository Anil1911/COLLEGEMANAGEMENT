package com.example.controller;//package com.example.controller;
//
//import com.example.entity.Student;
//import com.example.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class StudentController {
//    @Autowired
//    private StudentService studentService;
//    @GetMapping("/")
//    public String home(){
//        return "home";
//    }
//
//    public ModelAndView save(@ModelAttribute Student student){
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("student");
//        modelAndView.addObject("student",modelAndView);
//    }
//
//
//}










import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/saveStudent")
    public ModelAndView save(@ModelAttribute Student student){
        studentService.create(student);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("redirect:/");
        modelAndView.addObject("message","Student Successfully Registered");
        return modelAndView;
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/register")
    public String register() {
        return "register";
    }
}




















