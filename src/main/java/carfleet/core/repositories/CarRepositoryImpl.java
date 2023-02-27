package carfleet.core.repositories;

import carfleet.core.entity.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class CarRepositoryImpl implements CarRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> findAll() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("SELECT c FROM Car c", Car.class)
                        .getResultList();
    }

    @Override
    public List<Car> findById(Long id) {
        return sessionFactory
                .getCurrentSession()
                .createQuery("FROM Car WHERE id = :id", Car.class)
                .setParameter("id", id)
                .getResultList();

    }

    @Override
    public List<Car> findCar(Car car) {
        String hql = "FROM Car WHERE (:model is null or model = :model)" +
                "AND (:odometer is null or odometer = :odometer)" +
                "AND (:driver_id is null or driver_id = :driver_id)";
        return sessionFactory
                .getCurrentSession()
                .createQuery(hql, Car.class)
                .setParameter("model", car.getModel())
                .setParameter("odometer", car.getOdometer())
                .setParameter("driver_id", car.getDriver_id())
                .getResultList();
    }

    @Override
    public void delete(Car car) {
        sessionFactory
                .getCurrentSession()
                .createQuery("DELETE Car WHERE id = :id")
                .setParameter("id", car.getId());
    }

    @Override
    public void save(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    @Override
    public void update(Car car) {

        String hql = "UPDATE Car set model =:model, odometer =:odometer WHERE id =:id";

        sessionFactory.getCurrentSession().createQuery(hql)
                .setParameter("model", car.getModel())
                .setParameter("odometer", car.getOdometer())
                .setParameter("id", car.getId()).executeUpdate();
    }
}
