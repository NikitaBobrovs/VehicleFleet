package carfleet.core.services.car;

import carfleet.core.entity.Car;
import carfleet.core.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class UpdateCarService {
    @Autowired
    private CarRepository carRepository;

    public void execute(Car carToUpdate) {
        carRepository.update(carToUpdate);
    }

}
