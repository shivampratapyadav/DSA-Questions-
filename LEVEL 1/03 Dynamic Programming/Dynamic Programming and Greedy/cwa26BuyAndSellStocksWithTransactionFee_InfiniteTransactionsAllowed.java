/*
05-11-2021
FRIDAY

QUESTION --> Buy And Sell Stocks With Transaction Fee - Infinite Transactions Allowed :

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are give a number fee, representing the transaction fee for every transaction.
4. You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.

Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).

Input Format:
A number n
.. n more elements
A number fee

Output Format:
A number representing the maximum profit you can make if you are allowed infinite transactions with transaction fee.

Constraints:
0 <= n <= 20
0 <= n1, n2, .. <= 10
0 <= fee <= 5

Sample Input:
12
10
15
17
20
16
18
22
20
22
20
23
25
3

Sample Output:
13

*/

import java.util.*;
public class cwa26BuyAndSellStocksWithTransactionFee_InfiniteTransactionsAllowed{
    public static void main(String[] args)throws Exception{

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int fee = scn.nextInt();

        int obsp = -arr[0];
        int ossp = 0;

        for(int i = 1;i<arr.length;i++){
            int nbsp=0;
            int nssp=0;

            if(ossp-arr[i] > obsp){
                nbsp = ossp-arr[i];
            }

            else{
                nbsp = obsp;
            }

            if(nbsp+arr[i]-fee > ossp){
                nssp = nbsp+arr[i]-fee;
            }
            else{
                nssp = ossp;
            }

            obsp = nbsp;
            ossp = nssp;
        }


        System.out.println(ossp);
    }
}