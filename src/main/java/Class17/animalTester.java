package Class17;

public class animalTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="Chinoso";
        c.breed="Nigerian";
        c.color="Black";
        c.age=10;
        c.attitude=true;
        c.printInfo();
        Dog d=new Dog();
        d.bark();
        d.name="Kai";
        d.breed="German Shepherd";
        d.color="white";
        d.age=15;
        d.printInfo();
        animal a=new animal();
        a.name="Bruno";
        a.breed="bulldog";
        a.printInfo();
    }
}
