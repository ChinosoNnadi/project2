package Class18;
/*Create an instance final method that will
reverse a String and return that new String
Call method from the main method
**Expected Output:**
olleh
```*/

public class finalParent {
    static final String word = "hello";

    static String Speak(String word){
        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        System.out.println(sb.toString());
        return word;
    }
}
class finalParentTester{
    public static void main(String [] args){
        finalParent p = new finalParent();
        p.Speak("hello");
    }
}
