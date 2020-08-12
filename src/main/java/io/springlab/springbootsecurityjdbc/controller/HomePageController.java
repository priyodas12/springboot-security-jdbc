package io.springlab.springbootsecurityjdbc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomePageController {

    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String returnHomePageGeneric(){
        return "Welcome Anonymous User\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public String returnHomePageUser(){
        return "Welcome User\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/admin")
    public String returnHomePageAdmin(){
        return "Welcome Admin\n"+new Date();
    }
}
