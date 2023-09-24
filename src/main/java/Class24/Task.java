package Class24;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Chinoso");
        names.add("Nnadi");
        names.add("Jessica");
        names.add("Modestus");
        names.add("Augusta");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Evans"));
        System.out.println(names.size());

    }
}
