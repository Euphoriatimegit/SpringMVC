package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao car = new CarDaoImpl();
    @Override
    public List<Car> getCars(Integer count) {
        return car.getCars(count);
    }
}
