package Class26;

import java.util.TreeMap;

public class TaskMap3 {
    public static void main(String[] args) {

        TreeMap<Integer, String> bestBuyStore = new TreeMap<>();
        bestBuyStore.put(7664847, "Printer");
        bestBuyStore.put(7879885, "TV");

        var entries = bestBuyStore.entrySet();
        for (var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
