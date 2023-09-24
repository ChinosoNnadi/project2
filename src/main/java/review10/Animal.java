package review10;

public class Animal {
    void speak(){
        System.out.println("Animal speaks");
    }
    void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("wuff wuff");
    }
    @Override
    void eat() {
        System.out.println("Dog like to eat bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow meow");
    }
    @Override
    void eat() {
        System.out.println("Cat like to eat fresh fish from Guilia");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Animal[] arr={new Animal(), new Dog(), new Cat()};
        for (Animal a:arr){
            a.eat();
            a.speak();
        }
    }
}