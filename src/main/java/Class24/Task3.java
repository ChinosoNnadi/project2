package Class24;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Milk");
        words.add("Banana");
        words.add("Coffee");
        words.add("Table");
        words.add("TV");

        System.out.println(words);

        /*for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if(word.endsWith("e")) {
                words.remove(i);
            }
        }
        System.out.println(words);*/


       /* words.removeIf((String x)->{
            if(x.endsWith("e")){
                return true;
            }else{
                return false;
            }
        });*/

        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);
    }
}
