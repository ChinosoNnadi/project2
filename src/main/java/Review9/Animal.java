package Review9;

public class Animal {
    void sleep(){
        System.out.println("Animal Sleep");
    }
    void speak(){
        System.out.println("Animal Speak");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("wuff wuff");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
        d.sleep();
    }

}