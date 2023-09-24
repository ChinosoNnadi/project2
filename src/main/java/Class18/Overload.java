package Class18;

public class Overload {
    public void display(int num){
        System.out.println(num);
    }
    public void display(String words){
        System.out.println(words);
    }
    public void display(double price){
        System.out.println(price);
    }
}
class OverloadTester{
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.display(100);
        obj.display("Syntax Technology");
        obj.display(100.09);

    }
}
