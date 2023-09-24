package replit;

public class replier {
       private int a;

        private double b;

        private char ch;

        public void value(){
            a=10;
            b=10.23;
            ch='a';
        }
        public void value(int a, double b, char ch){
            this.a=a;
            this.b=b;
            this.ch=ch;
        }
        public void printValue(){
            System.out.println(a+" "+b+" "+ch);
        }
        public static void main(String[] args){
           replier r=new replier();
           r.a=10;
           r.b=10.23;
           r.ch='a';
           r.printValue();
           replier rs=new replier();
            rs.a=100;
            rs.b=100.23;
            rs.ch='s';
            rs.printValue();
        }
    }

