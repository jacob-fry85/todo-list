package com.darwinjacob.controller;

import com.darwinjacob.service.WebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class WebController {

    // == fields ==
    private final WebService webService;

    // == constructors ==
    @Autowired
    public WebController(WebService webService) {
        this.webService = webService;
    }

    // == request method ==

    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    // http://localhost:8080/todo-list/welcome
    // http://localhost:8080/todo-list/welcome?user=Darwin
    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model) {
        model.addAttribute("helloMessage", webService.getHelloMessage(user));
        model.addAttribute("age", age);
        log.info("model= {}", model);
        return "welcome";
    }

    // == model attributes ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return webService.getWelcomeMessage();
    }

}
