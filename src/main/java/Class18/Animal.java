package Class18;

public class Animal {
     void eat(){System.out.println("Cat eats");}
    void sleep(){System.out.println("Cat sleeps a lot");}
}
class Cat extends Animal{
    @Override
    void eat() {super.eat();}
    @Override
    void sleep() {super.sleep();}
}
class kitten1 extends Cat{
    @Override
    void eat() {System.out.println("kitten1 eats milk");}
    @Override
    void sleep() {System.out.println("kitten1 sleeps a lot");}
}
class kitten2 extends Cat{
    @Override
    void eat() {System.out.println("kitten2 eats milk");}
    @Override
    void sleep() {System.out.println("kitten2 sleeps a lot");}
}
class kitten3 extends Cat{
    @Override
    void eat() {System.out.println("kitten3 eats milk");}
    @Override
    void sleep() {System.out.println("kitten3 sleeps a lot");}
}
class AnimalTester{
    public static void main(String[] args) {
        Animal[] c = {new Cat(),new kitten1(),
                new kitten2(),new kitten3()};
        for(Animal arr:c){
            arr.eat();
            arr.sleep();
        }
    }
}