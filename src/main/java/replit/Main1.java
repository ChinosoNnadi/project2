package replit;
/*
Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."
The second method should be a static method that will print out the following message:
"Java is awesome."
Execute both methods
 */
public class Main1 {
    public void m1(){
        System.out.println("Programming is amazing.");
    }
    public static void m2(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args){
        Main1 obj=new Main1();
        obj.m1();
        m2();
    }
}
