/*
03-11-2021
WEDNESDAY

QUESTION --> Paint Fence :

1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive  fences have same colors.

Input Format:
A number n
A number k

Output Format:
A number representing the number of ways in which the fences could be painted so that not more than two fences have same colors.

Constraints:
1 <= n <= 10
1 <= k <= 10

Sample Input:
8
3

Sample Output:
3672

*/
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();


        int oscf = k ;
        int odcf = k*(k-1) ;

        int total = oscf+odcf;

        for(int i=3;i<=n;i++){

            int nscf = odcf;
            int ndcf = total*(k-1);


            total = nscf+ndcf;
            
            oscf = nscf ;
            odcf = ndcf ;

        }

        System.out.println(total);


    }
}