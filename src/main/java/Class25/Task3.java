package Class25;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Abuja");
        cities.add("Kent");
        cities.add("Virginia");
        cities.add("Lome");
        System.out.println(cities);
        cities.removeIf(n->n.startsWith("A"));
        System.out.println(cities);
    }
}
