package Class23Encapsulation;

import java.util.ArrayList;

public class collectionFramework {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Nnadi");
        names.add("Chinoso");
        names.add(10);
        names.add('F');
        System.out.println(names.size());
        System.out.println(names);
        names.remove(0);
        System.out.println(names.size());
        System.out.println(names);
    }
}
