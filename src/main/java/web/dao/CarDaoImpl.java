package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1989, "BMW", "B"));
        cars.add(new Car(1990, "Opel", "A"));
        cars.add(new Car(1991, "Renault", "A"));
        cars.add(new Car(1992, "Lexus", "C"));
        cars.add(new Car(1993, "VW", "B"));
        return (count != null && count > 0 && count < 5) ? cars.subList(0, count) : cars;
    }
}
