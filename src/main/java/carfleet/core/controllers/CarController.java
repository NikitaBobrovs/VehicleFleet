package carfleet.core.controllers;

import carfleet.core.entity.Car;
import carfleet.core.services.AddCarService;
import carfleet.core.services.FindAllCarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    AddCarService addCarService;

    @Autowired
    FindAllCarsService findAllCarsService;

    @GetMapping("/hello")
    public String hello (){
        return "Hello world";
    }

    @PostMapping("/add")
    void addCar(@RequestBody Car car){
         addCarService.execute(car);
    }

    @GetMapping("/get")
    public List<Car> findAll (){
        return findAllCarsService.execute();
    }
}
