package replit;
/*
Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;
 */
public class Main {
    private static int count=0;

    public Main(){
        count++;
    }
    public static void main(String[] args){
        Main obj=new Main();
        Main obj2=new Main();
        Main obj3=new Main();

        System.out.println(count);
    }
}
