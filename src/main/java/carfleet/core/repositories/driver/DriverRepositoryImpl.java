package carfleet.core.repositories.driver;

import carfleet.core.entity.Driver;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class DriverRepositoryImpl implements DriverRepository{

    @Autowired
    SessionFactory sessionFactory;


    @Override
    public List<Driver> findAllDrivers() {
        return sessionFactory.getCurrentSession()
                .createQuery("SELECT  d FROM Driver d", Driver.class)
                .getResultList();
    }

    @Override
    public List<Driver> findDriverById(Long id) {
        return sessionFactory.getCurrentSession()
                .createQuery("FROM Driver WHERE id =:id",Driver.class)
                .setParameter("id",id)
                .getResultList();
    }

    @Override
    public List<Driver> findDriver(Driver driver) {
        String hql = "FROM Driver WHERE " +
                "AND (fullName is null or fullName = :fullName)" +
                "AND (phoneNumber is null or phoneNumber = :phoneNumber)" +
                "AND (dob is null or dob = :dob)" +
                "AND (car_id is null or car_id = :car_id)";

        return sessionFactory.getCurrentSession()
                .createQuery(hql, Driver.class)
                .setParameter("fullName", driver.getFullName())
                .setParameter("phoneNumber", driver.getPhoneNumber())
                .setParameter("dob", driver.getDob())
                .setParameter("car_id", driver.getCar_id())
                .getResultList();
    }

    @Override
    public void addDriver(Driver driver) {
        sessionFactory.getCurrentSession().save(driver);
    }

    @Override
    public void deleteDriverById(Driver driver) {
        sessionFactory.getCurrentSession()
                .createQuery("DELETE Driver WHERE id = :id", Driver.class)
                .setParameter("id", driver.getId());   //TODO through Long id as param
    }

    @Override
    public void updateDriver(Driver driver) {
        String hql = "UPDATE Driver" +
                " SET fullName = :fullName," +
                " phoneNumber = :phoneNumber," +
                " dob = :dob" +
                " WHERE id = :id";

        sessionFactory.getCurrentSession()
                .createQuery(hql, Driver.class)
                .setParameter("fullName", driver.getFullName())
                .setParameter("phoneNumber", driver.getPhoneNumber())
                .setParameter("dob", driver.getDob())
                .setParameter("id", driver.getId());
    }
}
