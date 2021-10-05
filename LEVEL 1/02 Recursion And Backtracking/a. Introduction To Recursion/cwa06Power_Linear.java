/*
15 September 2021
WEDNESDAY

QUESTION -> Power-linear:
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function .

Input Format:
A number x
A number n

Output Format:
x raised to the power n

Constraints:
1 <= x <= 10
0 <= n <= 9

Sample Input:
2
5

Sample Output:
32

*/

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       Scanner scn = new Scanner(System.in);
       
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        int powerxn = power(x,n);
        System.out.println(powerxn);
    }

    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        
        int inipower = power(x,n-1);
        
        return inipower*x;
    }

}