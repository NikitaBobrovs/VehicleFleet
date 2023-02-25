package carfleet.core.repositories;
import carfleet.core.entity.Car;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CarRepository  {

    List<Car> findAll();

    List<Car> findById(Long id);

    List<Car> findCar(Car car);

    void delete(Car car);

    void save(Car car);

    void update(Car car);


}
