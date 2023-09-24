package Class25;

/*How can you remove all duplicates from ArrayList*/

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("John");
        name.add("Jane");
        name.add("James");
        name.add("Jasmine");
        name.add("Jane");
        name.add("James");
        System.out.println(name);
        LinkedHashSet<String> set = new LinkedHashSet<>(name);
        System.out.println(set);
        name.clear();
        System.out.println(name);
        name.addAll(set);
        System.out.println(name);
    }
}
