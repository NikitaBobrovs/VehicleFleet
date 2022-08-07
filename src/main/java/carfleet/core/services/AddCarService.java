package carfleet.core.services;

import carfleet.core.entity.Car;
import carfleet.core.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class AddCarService {
    @Autowired
    CarRepository repository;

    public String execute (Car carToAdd){

        Car car = new Car(carToAdd.getModel(), carToAdd.getOdometer(), carToAdd.getDriver_id());
        repository.save(car);
       return "New car added";
    }
}
