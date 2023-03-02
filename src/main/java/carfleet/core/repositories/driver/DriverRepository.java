package carfleet.core.repositories.driver;

import carfleet.core.entity.Driver;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository {
    List<Driver> findAllDrivers();

    List<Driver> findDriverById(Long id);

    List<Driver> findDriver(Driver driver);

    void addDriver(Driver driver);

    void deleteDriverById(Driver driver);

    void updateDriver(Driver driver);
}
