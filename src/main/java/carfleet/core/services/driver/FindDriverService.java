package carfleet.core.services.driver;

import carfleet.core.entity.Driver;
import carfleet.core.repositories.driver.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class FindDriverService {

    @Autowired
    DriverRepository driverRepository;

    public List<Driver> execute (Driver driver){
        return driverRepository.findDriver(driver);
    }
}
