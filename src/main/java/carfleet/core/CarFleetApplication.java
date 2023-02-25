package carfleet.core;

import carfleet.core.config.HibernateConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class CarFleetApplication {

    public static void main(String[] args) {
        SpringApplication application =  new SpringApplication(HibernateConf.class);
        application.run();
    }
}
