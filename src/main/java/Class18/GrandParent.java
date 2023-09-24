package Class18;

public class GrandParent {
    void Name(){
        System.out.println("Parents method");
    }
}
class GrandChild extends GrandParent{
    @Override
    void Name() {
        super.Name();
        System.out.println("Child method");
    }
}
class GrandParentTester{
    public static void main(String[] args) {

        GrandChild G = new GrandChild();

        G.Name();
    }
}
