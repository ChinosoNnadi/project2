package Class26;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
Only print those countries which contain more than 5 letters in their country
name and the letter 'a' in their capital names
 */

import java.util.TreeMap;

public class TaskMap2 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Canada", "Ottawa");
        countries.put("Nigeria", "Abuja");
        countries.put("England", "London");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");

        countries.forEach((k,v)->{
            if (k.length()>5 && v.contains("a")){
                System.out.println(k+" "+v);
            }
        });
    }
}
