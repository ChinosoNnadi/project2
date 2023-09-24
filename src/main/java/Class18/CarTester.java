package Class18;

public class CarTester {
    public static void main(String[] args) {
        BMW i8=new BMW("BMW", "i8", 80000, "black");
        i8.printInfo();
        Audi a=new Audi("Audi", "a", 280000, "red", true);
        a.printInfo();
    }
}
