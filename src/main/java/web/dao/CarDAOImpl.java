package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private List<Car> cars = makeCarList();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    private List<Car> makeCarList() {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "W202", 1995));
        cars.add(new Car("Lada", "2199", 2002));
        cars.add(new Car("Audi", "A4", 2009));
        cars.add(new Car("Toyota", "200", 2014));
        cars.add(new Car("Infiniti", "QX80", 2025));

        return cars;
    }

    @Override
    public List<Car> getAllCars() {
        return getCars();
    }
}