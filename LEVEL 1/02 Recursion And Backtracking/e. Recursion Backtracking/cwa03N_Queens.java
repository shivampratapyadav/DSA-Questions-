/*
14-10-2021
THURSDAY

QUESTION -> N QUEENS :

1. You are given a number n, the size of a chess board.
2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
Note - Queens kill at distance in all 8 directions
3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format:
A number n

Output Format:
Safe configurations of queens as suggested in sample output.

Constraints:
1 <= n <= 10

Sample Input:
4

Sample Output:
0-1, 1-3, 2-0, 3-2, .
0-2, 1-0, 2-3, 3-1, .

*/

import java.util.*;
public class cwa03N_Queens{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int [] [] arr = new int[n][n];

        printNQueens(arr, "", 0);

    }


    public static void printNQueens(int[][] chess, String qsf, int row) {

        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }

        
        for(int i=0;i<chess[0].length;i++){
            if(is_Queen_Safe(chess,row,i)==true && chess[row][i]==0){
            chess[row][i]=1;

            printNQueens(chess, qsf+row+"-"+i+", ", row+1);

            chess[row][i]=0;
            }

        }


    }

    public static boolean is_Queen_Safe(int[][]chess, int row, int col){
        
        //Vertical Check:
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]==1)
            return false;
        }
        //Left Diagonal Check:
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1)
            return false;
        }
        //Right Diagonal Check:

        for(int i=row-1,j = col+1;i>=0&&j<=chess[0].length-1;i--,j++){
            if(chess[i][j]==1)
            return false;
        }
        //Row Check:
        for(int j=col-1;j>=0;j--){
            if(chess[row][j]==1)
            return false;
        }

        return true;
    } 


}