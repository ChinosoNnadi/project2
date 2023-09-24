package Class25;

import java.util.LinkedHashSet;

public class E3LinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> uniqueNum = new LinkedHashSet<>();
        uniqueNum.add(20);
        uniqueNum.add(30);
        uniqueNum.add(90);
        uniqueNum.add(30);
        uniqueNum.add(10);
        System.out.println(uniqueNum);

    }
}
