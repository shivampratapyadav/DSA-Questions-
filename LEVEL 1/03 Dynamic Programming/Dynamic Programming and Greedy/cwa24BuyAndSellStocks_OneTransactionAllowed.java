/*
04-11-2021
THURSDAY

QUESTION --> Buy And Sell Stocks - One Transaction Allowed :

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed a single transaction.

Input Format:
A number n
.. n more elements

Output Format:
A number representing the maximum profit you can make if you are allowed a single transaction.

Constraints:
0 <= n <= 20
0 <= n1, n2, .. <= 10

Sample Input:
9
11
6
7
19
4
1
6
18
4

Sample Output:
17

*/
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int prices[] = new int[n];


        for(int i=0; i<prices.length; i++){

            prices[i] = scn.nextInt();

        }

        int msf = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < msf){
                msf = prices[i] ; 
            }

            int pod = prices[i]-msf;

            if(pod > max_profit)
            max_profit = pod;
        }


        System.out.println(max_profit);
    }
}