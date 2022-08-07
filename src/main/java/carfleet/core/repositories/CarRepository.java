package carfleet.core.repositories;

import carfleet.core.entity.Car;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Primary
@Transactional
public interface CarRepository extends JpaRepository<Car, Integer> {

}
