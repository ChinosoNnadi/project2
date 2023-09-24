package Class25;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkList {
    public static void main(String[] args) {

        long startingTime =  System.currentTimeMillis();

      /*  LinkedList<Integer> num = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            num.add(0, i);
        }*/
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0, i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(numbers.get(100000));
        }

        long endTime = System.currentTimeMillis();
        long timeTook = (endTime-startingTime);
        System.out.println(timeTook);
    }
}
