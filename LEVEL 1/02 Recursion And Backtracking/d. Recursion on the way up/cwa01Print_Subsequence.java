/*
02-10-2021
SATURDAY

QUESTION -> Print Subsequence:

1. You are given a string str.
2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 
Input Format :
A string str

Output Format :
Subsequences of str in order hinted by Sample output.

Constraints:
0 <= str.length <= 7

Sample Input:
yvTA

Sample Output:
yvTA
yvT
yvA
yv
yTA
yT
yA
y
vTA
vT
vA
v
TA
T
A


*/

import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        printSS(str, "");

    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);

            return ; 
        }

        char ch  = str.charAt(0);
        String ros = str.substring(1);

        printSS(ros, ans + ch);
        printSS(ros, ans+"");

    }

}