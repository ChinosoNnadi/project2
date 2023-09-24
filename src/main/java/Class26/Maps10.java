package Class26;

import java.util.TreeMap;

public class Maps10 {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticks", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.0);
        makeup.put("EyeLiner", 25.5);

        /*Set<Map.Entry<String, Double>> entries = makeup.entrySet();
        for(Map.Entry<String, Double> e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }*/
        //will return the keys and values
        makeup.entrySet();
        //removeif() is not present in maps but it is present in a set
        //convert map to set.
        //makeup.entrySet().removeIf(x->x.getKey().contains("a"));
       // makeup.entrySet().removeIf(x->x.getValue()>30);
        makeup.entrySet().removeIf(x->x.getKey().contains("a")&&x.getValue()>30);
        System.out.println(makeup);

        var entries = makeup.entrySet();
        for (var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
