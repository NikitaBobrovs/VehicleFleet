package carfleet.core.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "drivers")
public class Driver {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String  fullName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "date_of_birth", nullable = false)
    private Date dob;

    @Column(name = "car_id", nullable = false)
    private Long carId;

    public Driver(Long id, String fullName, String phoneNumber, Date dob, Long carId) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dob=" + dob +
                ", carId=" + carId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(id, driver.id) && Objects.equals(carId, driver.carId)
                && Objects.equals(fullName, driver.fullName)
                && Objects.equals(phoneNumber, driver.phoneNumber)
                && Objects.equals(dob, driver.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, phoneNumber, dob, carId);
    }
}

