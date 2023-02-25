package carfleet.core.services;

import carfleet.core.entity.Car;
import carfleet.core.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class AddCarService {

    @Autowired
    private CarRepository carRepository;

    public void execute (Car carToAdd){

        Car car = new Car(carToAdd.getModel(), carToAdd.getOdometer(), carToAdd.getDriver_id());
        carRepository.save(car);
    }
}
