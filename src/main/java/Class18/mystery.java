package Class18;

/*
Complete the mystery method so that it takes in an integer
array as a parameter, and then modifies each element based on
whether it's even or odd.

 If the number is even, divide it by 2.
 If it's odd, multiply it by 10.
 */

public class mystery {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array)	{
        for(int i=0; i<array.length; i++){
            if(array[i]%2!=0){
                array[i]=array[i]*10;
            }else if(array[i]%2==0){
                array[i]=array[i]/2;
            }
            System.out.print(array[i]+" ");
        }

    }
}
