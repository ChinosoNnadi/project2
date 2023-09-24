package Class19;

public class programming {

   public void program(){
        System.out.println("I love programming languages");
    }
   public void program(String s){
        System.out.println("I love "+s);
    }
}
class programmingTester{
    public static void main(String[] args) {
        programming pro=new programming();
        pro.program("java");
        System.out.println(pro);
        pro.program();
        System.out.println(pro);
    }
}