package Class19;

public class CreditCard {
    private double balance = 100;
    private float interest;

    public void instance(double balance) {
        System.out.println(balance + 0.05);
    }
}
    class Visa extends CreditCard{

    }
    class AX extends CreditCard{

      public   void instance(double balance) {
            System.out.println(balance + 0.07);
        }
    }

class tester{
    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        cc.instance(100);
       Visa v =new Visa();
       v.instance(120);
       AX ax = new AX();
       ax.instance(200);
    }
}
