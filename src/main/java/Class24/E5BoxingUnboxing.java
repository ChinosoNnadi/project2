package Class24;

public class E5BoxingUnboxing {
    public static void main(String[] args) {

        int a=10;
        Integer number = new Integer(a);
        int d = number.intValue();//converting from a class to a primitive
        System.out.println(d);
    }
}
