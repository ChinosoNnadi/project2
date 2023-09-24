package Class20;

import Class17.A;

public class Animal {
    void speak(){
        System.out.println("Animals can speak");
    }
    void sleep(){
        System.out.println("Animals sleep");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class dog extends Animal{

    @Override
    void speak() {
        System.out.println("wuff wuff");
    }
}
class cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow moew");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        dog d = new dog();
        d.speak();
        d.sleep();
        d.eat();
    }
}