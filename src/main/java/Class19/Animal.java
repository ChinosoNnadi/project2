package Class19;

public class Animal {
    private String name;
    private String color;
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    private int age;
    public void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class Dog extends Animal{
    int num=20;
    double weight;
    public Dog(String name, String color, int age, double weight) {
        super(name, color, age);
        this.weight=weight;
    }
   // public void printInfo(){
      //  System.out.println("my own Method");
   // }

    public void printInfo() {
        super.printInfo();
        System.out.println(weight);
    }
}
 class AnimalTester{
     public static void main(String[] args) {
         Dog d = new Dog("Jacky","Black",12, 89.0);
         d.printInfo();
     }
}
