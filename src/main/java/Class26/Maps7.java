package Class26;

import java.util.ArrayList;

public class Maps7 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        //new ArrayList<>(); =  creating the object of the ArrayList Class
        names.add("Chinoso");
        names.add("Chidera");
        names.add("Modestus");
        names.add("Augusta");

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        arrayLists.add(names);
        System.out.println(names);
    }
}
