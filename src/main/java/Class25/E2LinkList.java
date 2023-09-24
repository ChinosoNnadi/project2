package Class25;

import java.util.LinkedList;

public class E2LinkList {
    public static void main(String[] args) {
        LinkedList<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog("Bruno", "Persian"));
        dogs.add(new Dog("Jim", "German"));
        dogs.add(new Dog("Bruno", "German"));

        //getting the object stored in index 2 & storing it inside the d variable
        Dog d = dogs.get(2);
        d.printInfo();
    }
}
class  Dog{
    String name;
    String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name+" "+breed);
    }
}
