package carfleet.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/hello")
    public String hello (){
        return "Hello world";
    }
}
