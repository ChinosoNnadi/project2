package Class19;

public class minimum {
    public double mini(double a, double b){
        if(a<b){
            return a;
        }else {
            return b;
        }
    }
    public double mini(int a, int b){
        if(a<b){
            return a;
        }else {
            return b;
        }
    }
}
class minimumTester{
    public static void main(String[] args){
        minimum miniNum=new minimum();
        System.out.println(miniNum.mini(10.5,15.9));
    }
}
