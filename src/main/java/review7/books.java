package review7;
/*
Parameters:
- a String called s1
- a String called s2
Then inside method write logic that will return the strings combined,
one letter at a time, starting with s1.See example below for an example.
NOTE: s1 and s2 should be of equal lengths:
s1 ==> "12345"
s2 ==> "abcde"
mixString(s1,s2) ==> "1a2b3c4d5e"
 */

public class books {
        public static String mixString(String s1, String s2){
                StringBuilder sb = new StringBuilder();
                for(int i=0; i<5; i++){
                        sb.append(s1.charAt(i));
                        sb.append(s2.charAt(i));
                }
                return sb.toString();
        }
        //test case below (dont change):
        public static void main(String[] args){
                String firstValue = mixString("12345","abcde");
                System.out.println(firstValue);
                String secondValue = mixString("howdy","hello");
                System.out.println(secondValue);

        }
}