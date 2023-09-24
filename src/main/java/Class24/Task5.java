package Class24;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Kiwi");

        fruits.removeIf(n->n.contains("a")||n.endsWith("e"));
        System.out.println(fruits);
    }
}
