package Class24;

import java.util.ArrayList;

public class Lamda {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Milk");
        words.add("Banana");
        words.add("Coffee");
        words.add("Table");
        words.add("TV");

        /*for(String x:words){
            System.out.println(x);
        }*/
        words.forEach(x-> System.out.println(x));//Lamda Expression
    }
}
