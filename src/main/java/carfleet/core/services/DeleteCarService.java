package carfleet.core.services;

import carfleet.core.entity.Car;
import carfleet.core.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCarService {

    @Autowired
    private CarRepository carRepository;

    public void execute(Car carToDelete){
        carRepository.delete(carToDelete);
    }
}
