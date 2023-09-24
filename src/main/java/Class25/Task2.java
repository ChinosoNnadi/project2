package Class25;

import java.util.HashSet;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {

        TreeSet<String> countryName = new TreeSet<>();
        countryName.add("Nigeria");
        countryName.add("Ghana");
        countryName.add("USA");
        countryName.add("Canada");
        countryName.add("China");
        countryName.add("Taiwan");
        countryName.add("England");
        countryName.add("Germany");
        countryName.add("Nigeria");
        countryName.add("Canada");
        System.out.println(countryName);
        System.out.println("================================");
        //  OR
        countryName.forEach(n-> System.out.println(n));
        System.out.println("================================");
        // OR
        for(String s:countryName){
            System.out.println(s);
        }

    }
}
