package Class20;

public class E3TypesCasting {
    public static void main(String[] args) {
        Student s1=new Student("Modestus", "A122344od");
        Student s2=new Student("Chinoso", "7042246944");
        //OR
        Student[]arr={new Student("Modestus", "A122344od"),
                     new Student("Chinoso", "7042246944")};
        arr[0].printInfo();

        for (int i = 0; i < arr.length; i++) {
            Student s=arr[i];
            s.printInfo();
        }
    }
}
