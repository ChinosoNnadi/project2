package Class20;

public class E4PolyMor {
    public static void main(String[] args) {
        Animal[]arr={new cat(),new dog(),new Animal()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].sleep();
            arr[i].speak();
        }
    }
}
