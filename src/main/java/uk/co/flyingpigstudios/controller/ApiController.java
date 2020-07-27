package uk.co.flyingpigstudios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/a")
    public String index(){
        return "Rest Heroku Works...";
    }

}
