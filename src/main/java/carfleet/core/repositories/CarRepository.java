package carfleet.core.repositories;

import carfleet.core.entity.Car;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Primary
@Transactional
public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findById(Long id);
}
