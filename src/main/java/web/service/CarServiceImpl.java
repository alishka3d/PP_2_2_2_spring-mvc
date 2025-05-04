package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDAOImpl carDAOImpl;

    public CarServiceImpl(CarDAOImpl carDAOImpl) {
        this.carDAOImpl = carDAOImpl;
    }

    @Override
    public List<Car> getCarList(Integer count) {
        return count == null || count >= 5 ? carDAOImpl.getAllCars():
                carDAOImpl.getAllCars().stream().limit(count).toList();
    }
}
