package Class18;

public class Parent {
    public Parent(){
        System.out.println("Parent Constructor without argument");
    }
    public Parent(int num){
        System.out.println(num);
    }
}
class Child extends Parent{
    public Child() {
        super();
        System.out.println("Child Constructor without argument");
    }
    public Child(int num) {
        super(num);
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child c = new Child();
        Child cc = new Child(10);

    }
}


