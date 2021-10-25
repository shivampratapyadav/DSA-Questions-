/*
08-10-2021
FRIDAY

QUESTION -> Print Encodings :

1. You are given a string str of digits. (will never start with a 0)
2. You are required to encode the str as per following rules
    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.


Use the input-output below to get more understanding on what is required
123 -> abc, aw, lc
993 -> iic
013 -> Invalid input. A string starting with 0 will not be passed.
103 -> jc
303 -> No output possible. But such a string maybe passed. In this case print nothing.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format:
A string str

Output Format:
Permutations of str in order hinted by Sample output

Constraints:
0 <= str.length <= 10

Sample Input:
655196

Sample Output:
feeaif
feesf

*/

import java.util.*;

public class cwa07Print_Encodings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        printEncodings(str, "");
    }

    public static void printEncodings(String ques, String asf) {
        if(ques.length()==0){
            System.out.println(asf);
            return ;
        }

        else if(ques.length()==1){

            if(ques.charAt(0)=='0')
            return;

            else{
                char ch = ques.charAt(0);
                char code = (char)('a'+((ch-'0')-1));
                printEncodings("", asf+code);
            }
        }

        else{

            if(ques.charAt(0)=='0')
            return;

            char ch = ques.charAt(0);
            char code = (char)('a'+((ch-'0')-1));
            String ros = ques.substring(1);
            printEncodings(ros, asf+code);

            String ch01 = ques.substring(0,2);
            String ros01 = ques.substring(2);

            if(Integer.parseInt(ch01)<=26){
                char code01 = (char)('a'+(Integer.parseInt(ch01)-1));
                printEncodings(ros01, asf+code01);
            }



        }

    }

}