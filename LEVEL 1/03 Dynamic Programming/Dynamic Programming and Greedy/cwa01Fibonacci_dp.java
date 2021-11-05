/*
25-10-2021
MONDAY

QUESTION -> Fibonacci-dp:

1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

Note -> Notice precisely how we have defined the fibonnaci sequence
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8

Input Format:
A number n

Output Format:
A number representing the nth element of fibonnaci sequence

Constraints:
0 <= n <= 45

Sample Input:
10

Sample Output:
55

*/
import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int qb[] = new int[n+1];

        int fibonacci = fibonacciMemoised(n, qb);

        System.out.print(fibonacci);
    }

    public static int fibonacciMemoised(int n,int qb []){
        if(n==0||n==1){
            return n;
        }

        if(qb[n] !=0){
            return qb[n];
        }

        int fibonm1 = fibonacciMemoised(n-1, qb);
        int fibonm2 = fibonacciMemoised(n-2, qb);

        int fibon = fibonm1 + fibonm2;

        qb[n] = fibon;

        return fibon;

    } 
}