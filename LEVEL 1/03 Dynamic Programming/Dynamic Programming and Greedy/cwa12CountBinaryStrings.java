/*
1-11-2021
MONDAY

QUESTION --> Count Binary Strings :

1. You are given a number n.
2. You are required to print the number of binary strings of length n with no consecutive 0's.

Input Format:
A number n

Output Format:
A number representing the number of binary strings of length n with no consecutive 0's.

Constraints:
0 < n <= 45

Sample Input:
6

Sample Output:
21

*/

import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    
    int obs0 = 1;
    int obs1 = 1;
    
    for(int i=2;i<=n;i++){
        int nbs0 = obs1;
        int nbs1 = obs1+obs0;
        
        obs0=nbs0;
        obs1=nbs1;
    }
    
    System.out.println(obs0+obs1);
 }

}