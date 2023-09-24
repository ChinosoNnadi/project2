package Review9;

public class Parent {
    String name ="James";
    void printHello(){
        System.out.println("Hello World");
    }
    Parent(){
        System.out.println("Parent class contructor");
    }
    Parent(String n){
        System.out.println("Parents class with parameter");
    }
}
class child extends Parent{
    String name = "John";
    void printHello(){
        System.out.println("Hello Java");
    }
    void test(){
        String name = "White";
        System.out.println(super.name);
        System.out.println(this.name);//this keyword always take info from the instance variable
        System.out.println(name);
    }
    void methodTest(){
        super.printHello();//super keyword is always present in the parents class
    }
    public child(){
        super("Nono");
    }
}
class Tester{
    public static void main(String[] args) {
        child c = new child();
        c.test();
        c.methodTest();
    }
}
