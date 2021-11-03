/*
04-11-2021
THURSDAY

QUESTION --> Tiling With 2 * 1 Tiles :

1. You are given a number n representing the length of a floor space which is 2m wide. It's a 2 * n board.
2. You've an infinite supply of 2 * 1 tiles.
3. You are required to calculate and print the number of ways floor can be tiled using tiles.

Input Format:
A number n

Output Format:
A number representing the number of ways in which the number of ways floor can be tiled using tiles.

Constraints:
1 <= n <= 100

Sample Input:
8

Sample Output:
34


*/

import java.util.*;
public class cwa20TilingWith2_1Tiles {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int dp[] = new int [n+1];
        dp[0] = 0;
        dp[1] = 1;
        

        for(int i=2;i<=n;i++){
            if(i==2){
                dp[i] = 2;
            }

            else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }

        System.out.println(dp[n]);
    }
}