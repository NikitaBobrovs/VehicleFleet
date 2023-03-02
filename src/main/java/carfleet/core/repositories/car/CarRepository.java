package carfleet.core.repositories.car;
import carfleet.core.entity.Car;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CarRepository  {

    List<Car> findAllCars();

    List<Car> findCarById(Long id);

    List<Car> findCar(Car car);

    void deleteCarById(Car car);

    void addCar(Car car);

    void updateCar(Car car);


}
