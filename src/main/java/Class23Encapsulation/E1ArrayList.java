package Class23Encapsulation;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList();
        arr.add("Ace");
        arr.add("Chinoso");
        arr.add("Nnadi");
        arr.add("Modestus");
        System.out.println(arr.get(0));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("abcd"));
        System.out.println(arr.indexOf("Chinoso"));
    }
}
