package carfleet.core.services.driver;

import carfleet.core.entity.Driver;
import carfleet.core.repositories.driver.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddDriverService {

    @Autowired
    DriverRepository driverRepository;

    public void execute (Driver driver){
        Driver driverToDb =
                new Driver(driver.getFullName(),driver.getPhoneNumber(),driver.getDob(),driver.getCar_id());

        driverRepository.addDriver(driverToDb);
    }
}
