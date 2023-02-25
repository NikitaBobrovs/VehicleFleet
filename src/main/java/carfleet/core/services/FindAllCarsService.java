package carfleet.core.services;

import carfleet.core.entity.Car;
import carfleet.core.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllCarsService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> execute(){
        return carRepository.findAll();
    }
}
