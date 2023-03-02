package carfleet.core.services.car;

import carfleet.core.entity.Car;
import carfleet.core.repositories.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCarService {

    @Autowired
    private CarRepository carRepository;

    public void execute(Car carToDelete){
        carRepository.deleteCarById(carToDelete);
    }
}
