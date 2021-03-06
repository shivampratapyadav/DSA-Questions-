/*
04-11-2021
THURSDAY

QUESTION --> Buy And Sell Stocks Infinite Transactions Allowed :

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed infinite transactions.

Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy)

Input Format:
A number n
.. n more elements.

Output Format:
A number representing the maximum profit you can make if you are allowed infinite transactions.

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
30

*/
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int bd = 0;
        int sd = 0;
        int profit = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[sd]){
                sd++;
            }

            else if(arr[i]<arr[sd]){
                profit+= arr[sd]-arr[bd];

                sd=bd=i;
            }

        }

        profit+=arr[sd]-arr[bd];
        System.out.println(profit);
    }
}