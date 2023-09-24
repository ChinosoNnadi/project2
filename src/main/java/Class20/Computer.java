package Class20;

import org.checkerframework.checker.units.qual.Speed;

/*
   * Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
     Define common behavior within and some fields in parent class and override some of the methods in child classes
     Define some methods specific to child classes
     Create objects of child classes and store them into array. Loop through each object and execute available methods.
* */
public class Computer {
   // String Apple, Lenovo, HP, Dell;
   void CPUSpeed(){
       System.out.println("Central processing unit is fast");
   }
   void ramSize(){
       System.out.println("8GB of RAM");
   }
}
class Apple extends Computer{
    @Override
    void CPUSpeed() {
        System.out.println("Macintosh contains one of the fastest CPU");
    }
    @Override
    void ramSize() {
        System.out.println("I believe Apple RAM SIZE is almost Infinity");
    }
}
class Lenovo extends Computer{
    @Override
    void CPUSpeed() {
        System.out.println("Desktops for peak performance");
    }
    @Override
    void ramSize() {
        System.out.println("16GB for spreadsheets");
    }
}
class HP extends Computer{
    @Override
    void ramSize() {
        System.out.println("At least 32GB for gamers");
    }
    @Override
    void CPUSpeed() {
        System.out.println("Windows has good CPU");
    }
}
class Dell extends Computer{
    @Override
    void CPUSpeed() {
        System.out.println("Dell CPU is trying to compete in the market");
    }
    @Override
    void ramSize() {
        System.out.println("Dell ram size it coming to standard");
    }
}
class ComputerTester{
    public static void main(String[] args) {
        Computer [] arr = {new Apple(), new Dell(), new Lenovo(), new HP()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].CPUSpeed();
            arr[i].ramSize();
            System.out.println();
        }
    }
}
