package Class18;
/*Overload private instance method m1
Call each method from the main method.
Expected Output:
```
private m1 method
private m1 method with int parameter
```*/
public class ParentClass {
        private void m1(){System.out.println("private m1 method");}
        public void callM1(){m1();}
    }
    class Childs extends ParentClass{
        private void m1(int num){System.out.println("private m1 method with int parameter");}
        public void callM1(int num){m1(num);}
    }
class ParentClassTester {
    public static void main(String[] args) {
        Childs obj = new Childs();
        obj.callM1();
        obj.callM1(10);
        System.out.println("=======================");
    }

}
/*Overload static method and then execute both overloaded methods.

**Expected Output:**

static method without parameter
static method with int parameter
*/
class Parents {
    static void method1(){System.out.println("static method without parameter");}
    static void method1(int num){System.out.println("static method with int parameter");}
}
class Main {
    public static void main(String[] args) {
        Parents p = new Parents();
        p.method1();
        p.method1(10);
    }
}

