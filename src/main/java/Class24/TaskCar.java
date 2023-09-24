package Class24;

import java.util.ArrayList;

public class TaskCar {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");

        System.out.println(cars);
        for (String car:cars){
            System.out.println(car);
        }
    }
}
