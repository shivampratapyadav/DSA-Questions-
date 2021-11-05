/*
01-11-2021
MONDAY

QUESTION --> Unbounded Knapsack :

1. You are given a number n, representing the count of items.
2. You are given n numbers, representing the values of n items.
3. You are given n numbers, representing the weights of n items.
3. You are given a number "cap", which is the capacity of a bag you've.
4. You are required to calculate and print the maximum value that can be created in the bag without 
    overflowing it's capacity.
Note -> Each item can be taken any number of times. You are allowed to put the same item again 
                  and again.

Input Format:
A number n
v1 v2 .. n number of elements
w1 w2 .. n number of elements
A number cap

Output Format:
A number representing the maximum value that can be created in the bag without overflowing it's capacity

Constraints:
1 <= n <= 20
0 <= v1, v2, .. n elements <= 50
0 < w1, w2, .. n elements <= 10
0 < cap <= 10

Sample Input:
5
15 14 10 45 30
2 5 1 3 4
7

Sample Output:
100

*/
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int values [] = new int[n];
        for(int i=0;i<values.length;i++){
            values[i] = scn.nextInt();
        }

        int weights [] = new int[n];
        for(int i=0;i<weights.length;i++){
            weights[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int dp []= new int[cap+1];

        dp[0] = 0;

        for(int i=1;i<=cap;i++){
            int max=0;
            for(int j=0;j<n;j++){
                
                if(weights[j]<=i){
                    int val = values[j]+dp[i-weights[j]];
                    if(max<val)
                    max=val;
                }

            }
            dp[i] = max;

        }

        System.out.println(dp[cap]);
    }
}