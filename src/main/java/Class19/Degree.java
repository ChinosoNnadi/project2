package Class19;

public class Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diplomat");
    }
}
class Bachelors extends Degree{

}
class Master extends Degree{
    @Override
    public void getPrerequisite() {
        System.out.println("To get a Masters you need a Bachelors");
    }
}
class DegreeTester{
    public static void main(String[] args) {
        Degree d = new Degree();
        d.getPrerequisite();
        Bachelors b = new Bachelors();
        b.getPrerequisite();
        Master m = new Master();
        m.getPrerequisite();
    }
}
