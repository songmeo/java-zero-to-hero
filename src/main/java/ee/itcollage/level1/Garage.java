package ee.itcollage.level1;

import java.util.List;

public class Garage {
    public Garage(Ferrari ferrari) {
        this.f = ferrari;
    }
    public Garage() {}
    private Ferrari f;
    private List<Ferrari> cars;
    public Ferrari getFerrari() {
        return f;
    }
    public void setFerrari(Ferrari f) {
        this.f = f;
    }
    public List<Ferrari> getCars() {
        return cars;
    }
    public void setCars(List<Ferrari> cars) {
        this.cars = cars;
    }
    public void addFerrari(Ferrari f) {
        cars.add(f);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Garage{");
        sb.append("ferrari=").append(f);
        sb.append(", cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }
}
