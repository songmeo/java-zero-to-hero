package ee.itcollage.level1;

import java.util.ArrayList;
import java.util.List;

public class Millionaire {

    public static void main(String[] args) {
        //todo create a Garage.
        // create a Garage and put Ferrari in it.
        Garage g = new Garage();
        // print out Ferrari and make it print out sth nice (other than ee.itcollage.level1.Ferrari@1c20c684)
        Ferrari f = new Ferrari();
        g.putCar(f);
        System.out.println(f);
        // add a list of cars to Garage
        List<Ferrari> l = new ArrayList();
        g.putCars(l);
        // add another Ferrari to Garage
        Ferrari f1 = new Ferrari();
        g.putCar(f1);
        // make Garage print out a list of cars in it
        System.out.println(g.getCars());
    }
}
