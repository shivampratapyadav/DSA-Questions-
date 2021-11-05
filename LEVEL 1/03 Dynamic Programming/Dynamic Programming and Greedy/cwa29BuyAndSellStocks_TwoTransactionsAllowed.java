/*
06-11-2021
SATURDAY

QUESTION --> Buy And Sell Stocks - K Transactions Allowed :

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are given a number k, representing the number of transactions allowed.
3. You are required to print the maximum profit you can make if you are allowed k transactions at-most.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).

Input Format :
A number n
.. n more elements
A number k

Output Format :
A number representing the maximum profit you can make if you are allowed a single transaction.

Constraints:
0 <= n <= 20
0 <= n1, n2, .. <= 10
0 <= k <= n / 2

Sample Input:
6
9
6
7
6
3
8
1

Sample Output:
5

*/


//n^3 Complexity Code;
/*
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr [] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int dp [][] = new int[k+1][n];

        for(int t=1;t<=k;t++){
            for(int d = 1;d<arr.length;d++){
                int max = dp[t][d-1];

                for(int j=0;j<=d-1;j++){
                    int pdmj = dp[t-1][j]+arr[d]-arr[j];

                    if(pdmj>max)
                    max = pdmj;
                }

                dp[t][d] = max;
            }
        }


        System.out.println(dp[k][n-1]);

    }
}
*/

//n^2 Complexity Code:
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception{

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr [] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int dp [][] = new int[k+1][n];

        for(int t=1;t<=k;t++){
            int max = Integer.MIN_VALUE;

            for(int d = 1;d<arr.length;d++){

                if(dp[t-1][d-1]-arr[d-1]>max)
                max = dp[t-1][d-1]-arr[d-1];

                if(max+arr[d]>dp[t][d-1]){
                    dp[t][d] = max+arr[d];
                }
                else{
                    dp[t][d] = dp[t][d-1];
                }

            }
        }


        System.out.println(dp[k][n-1]);

    }
}