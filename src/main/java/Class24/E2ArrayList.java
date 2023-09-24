package Class24;

import java.util.ArrayList;

public class E2ArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Jessica");
        names.add("Modestus");
        names.add("Augusta");
        names.add("Nnadi");
        names.add("Munachimso");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("==================================");
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("==================================");

        int i=0;
        while (i<names.size()){
            System.out.println(names.get(i));
            i++;
        }
    }
}
