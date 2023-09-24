package Class17;

public class Parent {
        private String city;

        Parent(String city){
            this.city=city;
        }
        public void display(){
            System.out.println("City name " + city);
        }
    }
    class Child extends Parent{
        Child(String city) {
            super(city);
        }
    }
    class ParentTester{
        public static void main(String[] args) {
            Child c = new Child("Fairfax");
            c.display();
        }
    }