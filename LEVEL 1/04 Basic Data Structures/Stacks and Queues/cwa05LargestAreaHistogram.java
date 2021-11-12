/*
12-11-2021
FRIDAY

QUESTION -> Largest Area Histogram :

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the height of bars in a bar chart.
3. You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12

Input Format:
Input is managed for you.

Output Format:
A number representing area of largest rectangle in histogram

Constraints:
0 <= n < 20
0 <= a[i] <= 10

Sample Input:
7
6
2
5
4
5
1
6

Sample Output:
12

*/

import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    // code
    
    int seoli[] = new int[arr.length];
    Stack<Integer> st= new Stack<>();

    seoli[0] = -1;
    st.push(0);

    for(int i=1;i<arr.length;i++){
        while(st.size()!=0 && arr[st.peek()] >= arr[i]){
            st.pop();
        }

        if(st.size()==0){
            seoli[i] = -1;
        }
        else if(st.size()!=0){
            seoli[i]=st.peek();
        }

        st.push(i);

    }

    while(st.size()!=0){
        st.pop();
    }

    int seori[] = new int[arr.length];
    seori[arr.length-1] = arr.length;

    st.push(arr.length-1);

    for(int i=arr.length-2;i>=0;i--){
        while(st.size()!=0 && arr[st.peek()]>=arr[i]){
            st.pop();
        }

        if(st.size()==0){
            seori[i] = arr.length;
        }
        else if(st.size()!=0){
            seori[i]=st.peek();
        }

        st.push(i);
    }

    int max = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        int width = (seori[i]-seoli[i])-1;

        int area = width*arr[i];
        
        if(area>max)
        max=area;
    }

    System.out.println(max);

 }

}