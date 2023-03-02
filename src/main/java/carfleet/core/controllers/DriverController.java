package carfleet.core.controllers;

import carfleet.core.entity.Driver;
import carfleet.core.services.driver.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    AddDriverService addDriverService;

    @Autowired
    DeleteDriverByIdService deleteDriverByIdService;

    @Autowired
    FindAllDriversService findAllDriversService;

    @Autowired
    FindDriverByIdService findDriverByIdService;

    @Autowired
    FindDriverService findDriverService;

    @Autowired
    UpdateDriverService updateDriverService;


    @PostMapping("/add")
    void addDriver (@RequestBody Driver driver){
        addDriverService.execute(driver);
    }

    @DeleteMapping("/delete")
    void deleteDriverById (@RequestBody Driver driver){
        deleteDriverByIdService.execute(driver);
    }

    @GetMapping("/findAll")
    List<Driver> findAllDrivers(){
        return findAllDriversService.execute();
    }

    @GetMapping("/get")
    List<Driver> findDriverById (@RequestBody Driver driver){
        return findDriverByIdService.execute(driver);
    }

    @GetMapping("/findById")
    List<Driver> findDriver (@RequestBody Driver driver){
        return findDriverService.execute(driver);
    }

    @PostMapping("/update")
    void updateDriver (@RequestBody Driver driver){
        updateDriverService.execute(driver);
    }
}
