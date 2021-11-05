/*
27-10-2021
WEDNESDAY

QUESTION --> Target Sum Subsets - Dp :

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. You are required to calculate and print true or false, if there is a subset the elements of which add 
     up to "tar" or not.

Input Format:
A number n
n1
n2
.. n number of elements
A number tar

Output Format:
true or false as required.

Constraints:
1 <= n <= 30
0 <= n1, n2, .. n elements <= 20
0 <= tar <= 50

Sample Input:
5
4
2
7
1
3
10

Sample Output:
true

*/
import java.io.*;
import java.util.*;
public class Main{
     public static void main(String[] args) throws Exception {

          Scanner scn = new Scanner(System.in);

          int n = scn.nextInt();

          int arr [] = new int[n];

          for(int i=0;i<n;i++){
               arr[i] = scn.nextInt();
          }

          int tar = scn.nextInt();

          boolean dp [] [] = new boolean [n+1][tar+1];

          for(int i=0;i<dp.length;i++){
               for(int j=0;j<dp[0].length;j++){
                    if(i>=0 && j==0)
                    dp[i][j] = true;

                    else if(i>0&&j>0){

                         if(j<arr[i-1]&&dp[i-1][j]==true)
                         dp[i][j]=dp[i-1][j];

                         else if(j>=arr[i-1]){
                              if(dp[i-1][j]==true || dp[i-1][j-arr[i-1]]==true)
                              dp[i][j] = true;
                         }

                    }
               }
          }

          System.out.println(dp[n][tar]);
     }
}