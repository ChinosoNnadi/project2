package Class25;

import java.util.HashSet;

public class E1Set {
    public static void main(String[] args) {

        HashSet<Integer> unqNumbers = new HashSet<>();
        unqNumbers.add(10);
        unqNumbers.add(20);
        unqNumbers.add(10);
        unqNumbers.add(10);
        System.out.println(unqNumbers);
    }
}
