package Class21;

import org.checkerframework.checker.units.qual.C;

public abstract class Animal {
    abstract void speak();
    abstract void sleep();
    abstract void eat();
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("wuff wuff...");
    }
    @Override
    void sleep() {
        System.out.println("Sleeping for last 10 hours.....");
    }
    @Override
    void eat() {
        System.out.println("Eating bones.....");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow meow...");
    }
    @Override
    void sleep() {
        System.out.println("Sleeps for 16hrs ...");
    }
    @Override
    void eat() {
        System.out.println("Eat cat food");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Animal [] arr = {new Dog(), new Cat()};
        for(Animal a:arr){
            a.eat();
            a.sleep();
            a.speak();
        }
    }
}
