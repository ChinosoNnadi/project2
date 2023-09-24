package Class18;
/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields
private and define printInfo methods as well create the object of each class and call the methods
 */
public class Bird {
   protected String birdName;
    protected String birdBreed;
    protected int birdAge;
    protected double size;
    public Bird(String birdName, String birdBreed, int birdAge, double size){
        this.birdName=birdName;
        this.birdBreed=birdBreed;
        this.birdAge=birdAge;
        this.size=size;
    }
    public void printInfo(){
        System.out.println(birdName+" "+birdBreed+" "+birdAge+" "+size);
    }
}
    class sparrow extends Bird{
        public sparrow(String birdName, String birdBreed, int birdAge, double size){
            super(birdName, birdBreed, birdAge, size);
        }
}
class parrot extends Bird{
    public parrot(String birdName, String birdBreed, int birdAge, double size){
        super(birdName, birdBreed, birdAge, size);
    }
}
class birdTester{
    public static void main(String[] args) {
        sparrow S=new sparrow("Sparrow","house sparrow", 4, 11.3);
        S.printInfo();
        parrot P=new parrot("Parrot","Cockatoos", 6, 10.);
        P.printInfo();
    }
}


