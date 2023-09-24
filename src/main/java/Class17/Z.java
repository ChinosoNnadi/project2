package Class17;

public class Z {
    String name;
    void printName(){
        System.out.println(name);
    }
}
    class Y extends Z {
    String color;

    void printNameInfo() {
        System.out.println(color);
    }
}
class X extends Y {
    void printNameObj() {
        System.out.println(name+" "+color);
    }
    public static void main(String[] args) {
        Z z=new Z();
        z.name="Chidera";
        z.printName();
        Y y=new Y();
        y.color="fair";
        y.name="Augusta";
        y.printNameInfo();
        X x=new X();
        x.color="black";
        x.name="Ekezie";
        x.printNameObj();

    }
}

