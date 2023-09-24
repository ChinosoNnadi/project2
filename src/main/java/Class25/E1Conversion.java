package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Conversion {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(20);
        num.add(30);
        num.add(100);
        num.add(30);
        num.add(10);
        System.out.println(num);
        HashSet<Integer> set = new HashSet<>(num);
        System.out.println(set);

    }
}
