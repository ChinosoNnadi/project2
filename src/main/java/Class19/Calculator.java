package Class19;
public class Calculator {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
    public void add(double a, int b){
        System.out.println(a+b);
    }
}
 class CalculatorTester{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(20,20,20);
        cal.add(21.0, 22.0);
        cal.add(21.0, 22);
    }
}
