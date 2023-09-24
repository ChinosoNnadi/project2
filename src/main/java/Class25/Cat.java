package Class25;

import java.util.LinkedList;

public class Cat {
    private String name;
    private int age;
    private String breed;
    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("breed: "+breed);
    }
}
class Tester{
    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(new Cat("Tom,",10, "Grey"));
        cats.add(new Cat("Sam", 12, "Brown"));
        cats.add(new Cat("Nagi", 12, "Orange and White"));
        cats.forEach(x->x.printInfo());
    }
}
