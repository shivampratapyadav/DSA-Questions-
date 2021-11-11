/*
11-11-2021
THURSDAY

QUESTION -> Count Sort :

1. You are given an array(arr) of integers.
2. You have to sort the given array in increasing order using count sort.

Input Format:
An Integer n 
arr1
arr2..
n integers.

Output Format:
Check the sample ouput and question video.

Constraints:
1 <= N <= 10000
-10^8 <= arr[i] <= 10^8

Sample Input:
5
7 
-2 
4 
1 
3

Sample Output:
-2
1
3
4
7

*/

import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int range =  (max-min)+1;

   int fq[] = new int[range];
   for(int i=0;i<arr.length;i++){
       int val = arr[i];
       int fidx = val-min;

       fq[fidx]++;
   }

   for(int i=1;i<fq.length;i++){
       fq[i]+=fq[i-1];
   }

   int ans [] = new int[arr.length];

   for(int i=arr.length-1;i>=0;i--){
       int val = arr[i];
       int idx = (val-min);
       ans[fq[idx]-1]=val;

       fq[idx]--;
   }

   for(int i=0;i<arr.length;i++){
       arr[i]=ans[i];
   }

  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}