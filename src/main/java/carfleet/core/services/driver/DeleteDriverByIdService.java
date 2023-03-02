package carfleet.core.services.driver;

import carfleet.core.entity.Driver;
import carfleet.core.repositories.driver.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteDriverByIdService {

    @Autowired
    DriverRepository driverRepository;

    public void execute (Driver driver){
        driverRepository.deleteDriverById(driver);
    }
}
