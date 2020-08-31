package ee.itcollage.level1;

import java.util.ArrayList;
import java.util.List;

public class Millionaire {

    public static void main(String[] args) {
        //todo create a Garage.
        // create a Garage and put Ferrari in it.
        Garage g = new Garage();
        g.setFerrari(new Ferrari());
        // print out Ferrari and make it print out sth nice (other than ee.itcollage.level1.Ferrari@1c20c684)
        System.out.println(g.getFerrari());
        Ferrari f = new Ferrari();
        System.out.println(f);
        // add a list of cars to Garage
        List<Ferrari> l = List.of(new Ferrari(), new Ferrari());
        g.setCars(l);
        // add another Ferrari to Garage
        g.addFerrari(new Ferrari());
        // make Garage print out a list of cars in it
        System.out.println(g);
    }
}
