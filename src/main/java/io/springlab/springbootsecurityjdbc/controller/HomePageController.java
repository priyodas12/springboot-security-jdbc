package io.springlab.springbootsecurityjdbc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomePageController {

    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String returnHomePageGeneric(){
        return "Welcome to common Env\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/test")
    public String returnHomePageTester(){
        return "Welcome to Testing Env\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/dev")
    public String returnHomePageDeveloper(){
        return "Welcome to Developing Env\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/prod")
    public String returnHomePageAdmin(){
        return "Welcome to Production Env\n"+new Date();
    }
}
