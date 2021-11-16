/*
12-11-2021
FRIDAY

QUESTION -> Next Greater Element To The Right :

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.

Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1

Input Format:
Input is managed for you.

Output Format:
Output is managed for you.

Constraints:
0 <= n < 10^5
-10^9 <= a[i] <= 10^9

Sample Input:
5
5
3
8
-2
7

Sample Output:
8
8
-1
7
-1

*/

//Travelling from right to left and using -a+ technique(On complexity):
/*
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   Stack<Integer> st = new Stack<>();

        int ngeor[] = new int[arr.length];

        ngeor[arr.length-1] =-1;
        st.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){
            int val = arr[i];

            while(st.size()!=0&&st.peek()<=val){
                st.pop();
            }

            if(st.size() == 0){
                ngeor[i] = -1;

                st.push(val);
            }
            else if(st.size()!=0){
                ngeor[i] = st.peek();
                st.push(val);
            }
        }

        return ngeor;
 }

}
*/

//Alternate approach -> travelling left to right;

import java.io.*;
import java.util.*;

public class Main{

  public static void display(int[] a){

    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }

    System.out.println(sb);

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){

   // solve
   Stack<Integer> st = new Stack<>();

    int ngeor[] = new int[arr.length];
    for(int i=0;i<=arr.length-1;i++){
        while(st.size()!=0 && arr[st.peek()]<=arr[i]){
            ngeor[st.peek()] = arr[i]; 
            st.pop();
        }

        st.push(i);
    }

    while(st.size()!=0){
        ngeor[st.peek()] = -1; 
        st.pop();
    }


    return ngeor;
 }

}