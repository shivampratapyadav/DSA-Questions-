/*
11-11-2021
THURSDAY

QUESTION -> Sort Dates :

1. You are given an array(arr) of different dates in format DD-MM-YYYY.
2. You have to sort these dates in increasing order.

Input Format:
An Integer N 
arr1
arr2..
n integers.

Output Format:
Check the sample output and question video.

Constraints:
1 <= N <= 10000
All dates are between year 0 to year 2500.

Sample Input:
5
12041996
20101996
05061997
12041989
11081987

Sample Output:
11081987
12041989
12041996
20101996
05061997

*/

import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    // write your code here
    countSort(arr,1000000,100,32);
    countSort(arr,10000,100,13);
    countSort(arr,1,10000,2501);

  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    String ans [] = new String[arr.length];
    
    // write your code here
    int fq[] = new int[range];
   for(int i=0;i<arr.length;i++){
       fq[Integer.parseInt(arr[i],10)/div%mod]++;
   }
 
   for(int i=1;i<fq.length;i++){
       fq[i]+=fq[i-1];
   }

   

   for(int i=arr.length-1;i>=0;i--){
       ans[fq[Integer.parseInt(arr[i],10)/div%mod]-1]=arr[i];

       fq[Integer.parseInt(arr[i],10)/div%mod]--;
   } 

   for(int i=0;i<arr.length;i++){
       arr[i]=ans[i];
   }

  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}