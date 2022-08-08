package carfleet.core.controllers;

import carfleet.core.entity.Car;
import carfleet.core.services.AddCarService;
import carfleet.core.services.DeleteCarService;
import carfleet.core.services.FindAllCarsService;
import carfleet.core.services.UpdateCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    AddCarService addCarService;

    @Autowired
    FindAllCarsService findAllCarsService;

    @Autowired
    DeleteCarService deleteCarService;

    @Autowired
    UpdateCarService updateCarService;

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

    @DeleteMapping("/delete")
    void deleteCar (@RequestBody Car car){
        deleteCarService.execute(car);
    }

    @PostMapping("/update")
    void updateCar (@RequestBody Car car){
        updateCarService.execute(car);
    }
}
