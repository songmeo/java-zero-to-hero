package ee.itcollage.level1;

import java.util.List;

public class Garage {
    private List<Ferrari> cars;
    public void putCar(Ferrari f) {
        cars.add(f);
    }
    public void putCars(List<Ferrari> cars) {
        for(Ferrari f : cars)
            this.cars.add(f);
    }

    public List<Ferrari> getCars() {
        return cars;
    }
}
