package Class17;

public class pWork {
        public void m1(){
            System.out.println("I am parent public/protected/default/private method");}
        private void m2(){
            System.out.println("I am parent public/protected/default/private method");}
        protected void m3(){
            System.out.println("I am parent public/protected/default/private method");}
        void m4(){
            System.out.println("I am parent public/protected/default/private method");}
    }
    class Child4 extends pWork{
        @Override
        public void m1() {
            System.out.println("I am a child public method");
        }
        @Override
        protected void m3() {
            System.out.println("I am a child protected method");
        }
        @Override
        void m4() {
            System.out.println("I am a child default method");
        }
    }
    class pWorkTester{
        public static void main(String[] args) {
            Child4 c = new Child4();
            c.m1();
            c.m3();
            c.m4();
        }
    }