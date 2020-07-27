package uk.co.flyingpigstudios.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    public String index(){
        return "Rest Heroku Works...";
    }

}
