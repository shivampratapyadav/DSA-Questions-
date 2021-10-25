/* 
23 September 2021
SATURDAY

QUESTION -> Max Of An Array:

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input. 
4. For the purpose complete the body of maxOfArray function. Don't change the signature.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format:
A number n
n1
n2
.. n number of elements

Output Format:
A number representing max

*/


import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int arrayMax = maxArray(arr, n-1 );

        System.out.print(arrayMax);
    }

    public static int maxArray(int [] arr, int idx ){
        if(idx==0){
            return arr[0];
        }
        
        int maximum = maxArray(arr, idx-1 );
        if(maximum>arr[idx])
        return maximum;

        return arr[idx];
    }
}