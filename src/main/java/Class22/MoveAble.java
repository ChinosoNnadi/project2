package Class22;

public interface MoveAble {
    public abstract void move();

    void wash();
}
interface WashAble{
    void wash();
}
class Dog implements MoveAble, WashAble{
    @Override
    public void move() {
        System.out.println("Dogs can jump run and can move");
    }
    @Override
    public void wash() {
        System.out.println("You can safely wash a Dog");
    }
}
class Car implements MoveAble, WashAble{
    @Override
    public void move() {
        System.out.println("Car can move forward backward");
    }
    @Override
    public void wash() {
        System.out.println("We can wash a car");
    }
}
class MoveAbleTester{
    public static void main(String[] args) {
        MoveAble [] arr = {new Car(),new Dog()};
        for (MoveAble Arr:arr){
            Arr.move();
            Arr.wash();
        }
    }
}
