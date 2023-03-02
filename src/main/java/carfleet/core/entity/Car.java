package carfleet.core.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table (name = "cars")
public class Car {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "odometer", nullable = false)
    private double odometer;

    @Column(name = "driver_id")
    private Long driver_id;

    public Car(String model, double odometer, Long driver_id) {
        this.model = model;
        this.odometer = odometer;
        this.driver_id = driver_id;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", odometer=" + odometer +
                ", driver_id='" + driver_id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Car car = (Car) o;
        return id != null && Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

