class A {
     int i;
    A(int i){
        this.i=i;
    }
}
class B  extends A{

    B(int i) {
        super(i);
    }
    void displayValue(){
        System.out.println(i);
    }
}
class Atester{
    public static void main(String[] args) {
        B b = new B(20);
        B b1 = new B(10);
        b.displayValue();
        b1.displayValue();
    }
}