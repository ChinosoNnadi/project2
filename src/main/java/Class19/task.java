package Class19;

public class task {
    public static void Task1(int a, int b){
        System.out.println("not overloaded");
    }
    public static void Task1(double a, double b){
        System.out.println("overloaded");
    }
    public static void Task1(String a, String b){
        System.out.println("overloaded reloaded");
    }
}
 class taskTester{
    public static void main(String[] args) {
        task t1=new task();
        t1.Task1(2,4);

    }
}
