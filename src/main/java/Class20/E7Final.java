package Class20;

public class E7Final {
    public static void main(String[] args) {
        final int Age=10;
        //Age=20;
        System.out.println(Age);
    }

}
class Parent{
    final void marry(){
        System.out.println("take out permission first");
    }
}
class child extends Parent{

   /* @Override
    void marry() {
        System.out.println("I want to marry someone else");
    }*/
}
