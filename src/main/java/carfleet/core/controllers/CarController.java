package carfleet.core.controllers;

import carfleet.core.entity.Car;
import carfleet.core.services.car.*;
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

    @Autowired
    FindCarService findCarService;

    @Autowired
    FindCarByIdService findCarByIdService;

    @PostMapping("/add")
    void addCar(@RequestBody Car car){
         addCarService.execute(car);
    }

    @GetMapping("/get")
    public List<Car> findAll (){
        return findAllCarsService.execute();
    }

    @GetMapping("/find")
    public List<Car> findCar (@RequestBody Car car) {
        return findCarService.execute(car);
    }

    @GetMapping("/findById")
    public List<Car> findById (@RequestBody Car car) {
        return findCarByIdService.execute(car);
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
