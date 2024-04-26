package com.beautysoul.beautysoul.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitasController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String addUser (){
        return "Agragando Usuario";
    }
}
