package Class26;

import java.util.LinkedHashMap;

public class Maps2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> Students = new LinkedHashMap<>();
        Students.put(10, "Adam");
        Students.put(20, "Ehab");
        Students.put(300, "Marta");
        Students.put(45, "Ahmed");
        System.out.println(Students);
        Students.remove(300);
        System.out.println(Students);
        Students.replace(20, "Chinoso");
        System.out.println(Students);
    }
}
