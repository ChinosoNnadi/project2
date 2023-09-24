package Class17;

public class Subtraction {
    public void subtraction(int num1, int num2, int num3, int num4){
        int num = num1-num2-num3-num4;
        System.out.println(num);
    }
    public void subtraction(int num2, int num3, int num4){
        int num = num2-num3-num4;
        System.out.println(num);
    }
    public void subtraction(int num3, int num4){
        int num = num3-num4;
        System.out.println(num);
    }
}
class SubtractionTester{
    public static void main(String[] args) {
        Subtraction s = new Subtraction();
        s.subtraction(200,180);
    }
}
