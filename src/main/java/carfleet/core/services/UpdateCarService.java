package carfleet.core.services;

import carfleet.core.entity.Car;
import carfleet.core.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component

public class UpdateCarService {
    @Autowired
    private CarRepository carRepository;

    public void execute (Car carToUpdate){

        Car carFromDB = carRepository.findById(carToUpdate.getId()).get(0);

        carRepository.delete(carFromDB);

        if(!(carToUpdate.getModel().matches(carFromDB.getModel()))){
            carFromDB.setModel(carToUpdate.getModel());
        }
        if(carToUpdate.getOdometer() != carFromDB.getOdometer()){
            carFromDB.setOdometer(carToUpdate.getOdometer());
        }
        if(!(Objects.equals(carToUpdate.getDriver_id(), carFromDB.getDriver_id()))){
            carFromDB.setDriver_id(carFromDB.getDriver_id());
        }

        carRepository.save(carFromDB);
    }

    //TODO update inside db to keep same car_id
}
