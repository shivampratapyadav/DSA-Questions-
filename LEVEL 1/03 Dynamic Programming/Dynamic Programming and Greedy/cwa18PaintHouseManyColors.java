/*
03-11-2021
WEDNESDAY

QUESTION --> Paint House - Many Colors :

1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.

Input Format:
A number n
n1-0th n1-1st n1-2nd .. n1-kth
n2-0th n2-1st n2-2nd .. n2-kth
.. n number of elements.

Output Format:
A number representing the minimum cost of painting all houses without painting any consecutive house with same color.

Constraints:
1 <= n <= 1000
1 <= k <= 10
0 <= n1-0th, n1-1st, .. <= 1000

Sample Input:
4 3
1 5 7
5 8 4
3 2 9
1 2 4


Sample Output:
8

*/

//N^3 cpmplexity solution:
/*
import java.util.*;
public class cwa18PaintHouseManyColors{
    public static void main(String[] args)throws Exception{
        
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int k = scn.nextInt();

    int arr [][] = new int[n][k];

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j] = scn.nextInt();
        }
    }

    int dp[][] = new int[n][k];

    for(int i=0;i<dp.length;i++){

        for(int j=0;j<dp[0].length;j++){

            if(i==0){
                dp[i][j] = arr[i][j];
            }

            else if(i>0){
                int min = Integer.MAX_VALUE;

                for(int a=0;a<arr[0].length;a++){

                    if(a!=j){

                        if(dp[i-1][a]<min)
                        min = dp[i-1][a];

                    }

                }

                dp[i][j] = arr[i][j]+min;
            }

        }
    }
        
        
        int min = Integer.MAX_VALUE;

        for(int i=0;i<dp[0].length;i++){

            if(dp[n-1][i]<min)
            min = dp[n-1][i];

        }

    System.out.println( min );

    }
}

*/

//N^2 Complexity Code:

import java.util.*;
public class cwa18PaintHouseManyColors {

    public static void main(String[] args)throws Exception {
        
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int k = scn.nextInt();

    int arr [][] = new int[n][k];

    for(int i=0;i<arr.length;i++) {
        for(int j=0;j<arr[0].length;j++) {
            arr[i][j] = scn.nextInt();
        }
    }

    int dp [][] = new int[n][k];


    int least = Integer.MAX_VALUE;
    int sleast = Integer.MAX_VALUE;


    for(int i=0;i<arr[0].length;i++){

        dp[0][i] = arr[0][i] ;

        if(dp[0][i]<=least){
            sleast = least;
            least = dp[0][i];
        }

        else if(dp[0][i]<sleast){
            sleast = dp[0][i];
        }
    }

    for(int i=1;i<dp.length;i++){

        int nleast = Integer.MAX_VALUE;
        int nsleast = Integer.MAX_VALUE;
        

        for(int j=0;j<dp[0].length;j++){
            if(least == dp[i-1][j]){
                dp[i][j] = arr[i][j]+sleast;
            }

            else{
                dp[i][j] = arr[i][j] + least;
            }

            if(dp[i][j] <= nleast){
                nsleast = nleast;
                nleast = dp[i][j];
            }

            else if(dp[i][j]<nsleast){
                nsleast = dp[i][j];
            }

        }

        least = nleast ;
        sleast = nsleast ;

    }

    System.out.println(least);

    }
}