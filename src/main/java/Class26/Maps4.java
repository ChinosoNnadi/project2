package Class26;

import java.util.TreeMap;

public class Maps4 {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticks", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.0);
        makeup.put("EyeLiner", 25.5);
        //both keys and values
        makeup.forEach((k, v)->System.out.println(k+" "+v));
        //Only key
        makeup.forEach((k, v)->System.out.println(k));
        //Only value
        makeup.forEach((k, v)->System.out.println(v));
        //whenever you need more than one parameter you need to put parentheses
        //similarly if we want to have more than one line of code we need to have
        //curly brackets as well
        makeup.forEach((k,v)->{
            if (k.contains("a")){
                System.out.println(v);
            }
        });

    }
}
