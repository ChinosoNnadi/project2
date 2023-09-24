package Class18;

public class Car {
    String name;
    String model;
    double price;
    String color;
    public Car(String name, String model, double price, String color){
        this.name=name;
        this.model=model;
        this.price=price;
        this.color=color;
    }
    void printInfo(){
        System.out.println(name+" "+model+" "+price+" "+color);
    }
}
class BMW extends Car{
    public BMW(String name, String model, double price, String color){
        super(name,model,price,color);
    }
}
class Audi extends Car{
    boolean sunRoof;
    public Audi(String name, String model, double price, String color, boolean sunRoof){
      //calling the constructor from the parent class
        super(name,model,price,color);
        this.sunRoof=sunRoof;
    }
}