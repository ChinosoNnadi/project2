package Class19;

public class task2 {

        private void Task2(int a, int b){
            System.out.println("not overloaded");
        }
        private void Task2(double a, double b){
            System.out.println("overloaded");
        }
        private void Task2(String a, String b){
            System.out.println("overloaded reloaded");
        }
    }
     class task2Tester{
        public static void main(String[] args) {
            task2 t2=new task2();
            //t2.Task2("bird's","wing");

        }
    }

