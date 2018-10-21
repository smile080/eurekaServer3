package com.ini.rest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
 
 
    @RequestMapping(value = "/hello")
    public String  saveArticle() {
    	return "Hello spring boot ";
    }
    
    
    
}