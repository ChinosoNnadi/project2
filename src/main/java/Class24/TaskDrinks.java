package Class24;

import java.util.ArrayList;

public class TaskDrinks {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Fanta");
        drinks.add("Coke");
        drinks.add("Red Bull");
        drinks.add("7up");


        for (int i=0; i<drinks.size(); i++){

            String drink = drinks.get(i);
            if(drink.contains("a") || drink.contains("e")){
                drinks.set(i, "water");
            }

        }System.out.println(drinks);

    }
}
