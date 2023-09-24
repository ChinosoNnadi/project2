package Class20;

import java.io.IOException;

public class Task1 {
    void course(){
        System.out.println("Java");
    }
    void read(){
        System.out.println("I enjoy reading Java Code");
    }
    void listen(){
        System.out.println("Listening to Java audio is great");
    }
}
class SyntaxStudent extends Task1{
    @Override
    void course() {
        System.out.println("Selenium");
    }
}
class CollegeStudent extends Task1{
    @Override
    void read() {
        System.out.println("Not as good as Syntax Technology Student");
    }
}
class SchoolStudent extends Task1{
    @Override
    void listen() {
        System.out.println("Likes attending Java class instead of reading");
    }
}
class tester{
    public static void main(String[] args) {
        Task1 [] arr= {new CollegeStudent(),new SyntaxStudent(),
                        new SchoolStudent(), new Task1()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].course();
            arr[i].read();
            arr[i].listen();
        }

    }
}

