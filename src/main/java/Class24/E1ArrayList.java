package Class24;

import java.util.ArrayList;

public class E1ArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Jessica");
        names.add("Modestus");
        names.add("Augusta");
        names.add("Nnadi");
        names.add("Munachimso");
        names.remove("Jessica");
        System.out.println(names);
        names.add(3,"Chidera");
        System.out.println(names);
        names.set(2,"Chinoso");
        System.out.println(names);
    }
}
