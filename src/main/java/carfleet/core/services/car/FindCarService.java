package carfleet.core.services.car;

import carfleet.core.entity.Car;
import carfleet.core.repositories.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindCarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> execute (Car car) {
        return carRepository.findCar(car);
    }
}
