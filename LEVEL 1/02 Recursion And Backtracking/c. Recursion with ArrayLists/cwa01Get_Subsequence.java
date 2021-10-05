/*
16 September 2021
THURSDAY

QUESTION -> Get Subsequence:

1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format:
A string str

Output Format:
Contents of the arraylist containing subsequences as shown in sample output

Constraints:
0 <= str.length <= 20

Sample Input:
abc

Sample Output:
[, c, b, bc, a, ac, ab, abc]

*/

import java.util.*;

public class cwa01Get_Subsequence {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        ArrayList <String> ss = gss(str);

        System.out.println(ss);
    }

    public static ArrayList<String> gss(String str) {

        if(str.length()==0) {

          ArrayList <String> ssi =new ArrayList<>();
          ssi.add("");
  
          return ssi; 

        }

      char ch = str.charAt(0);
      
      ArrayList<String> ss1 = gss(str.substring(1));
  
      ArrayList<String> getss = new ArrayList<>();

        for(String s:ss1) {
            getss.add(""+s);
        }

        for(String s:ss1) {
            getss.add(ch+s);
        }

     return getss;

    } 

}