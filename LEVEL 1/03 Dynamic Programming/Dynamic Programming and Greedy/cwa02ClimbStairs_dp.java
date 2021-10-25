/*
25-10-2021
MONDAY

QUESTION -> Fibonacci-dp:

1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.

Input Format:
A number n

Output Format:
A number representing the number of ways to climb the stairs from 0 to top.

Constraints:
0 <= n <= 20

Sample Input:
4

Sample Output:
7

*/

//MEMOISATION METHOD :

/*

import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int qb[] = new int[n+1];
        int totalPaths = climbStairs(n, qb);

        System.out.println(totalPaths);

    }

    public static int climbStairs(int n, int [] qb){
        
        if(n==0){
            return 1;
        }
        
        else if(n<0){
            return 0;
        }

        if(qb[n]!=0){
            return qb[n];
        }

        int pathnm1 = climbStairs(n-1,qb);
        int pathnm2 = climbStairs(n-2,qb);
        int pathnm3 = climbStairs(n-3,qb);

        int pathn = pathnm1+pathnm2+pathnm3;

        qb[n] = pathn;

        return pathn;

    }
}

*/

// TABULATION METHOD:

import java.util.*;
public class Main {

    public static void main(String[] args)throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int totalPaths = climbStairs_Tabulation(n);

        System.out.println(totalPaths);

    }

    public static int climbStairs_Tabulation(int n){
        
        int qb [] = new int[n+1];
            qb[0]=1;

            for(int i=1;i<=n;i++){

                if(i==1){
                    qb[i] = qb[i-1];
                }

                else if(i==2){
                    qb[i] = qb[i-1]+qb[i-2];
                }

                else{
                    qb[i] = qb[i-1]+qb[i-2]+qb[i-3];
                }
            }
        return qb[n];
    }
    
}
