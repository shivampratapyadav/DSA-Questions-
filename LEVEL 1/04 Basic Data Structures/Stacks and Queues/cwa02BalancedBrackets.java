/*
09-11-2021
TUESDAY

QUESTION -> Balanced Brackets :

1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.
e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false

Input Format:
A string str

Output Format:
true or false

Constraints:
0 <= str.length <= 100

Sample Input:
[(a + b) + {(c + d) * (e / f)}]

Sample Output:
true

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='['||ch=='('||ch=='{'){
                st.push(ch);
            }

            else if(ch==']'){

                if(st.size() == 0){
                    System.out.println(false);
                    return;
                }

                else if(st.peek()!='['){
                    System.out.println(false);
                    return;
                }

                else{
                    st.pop();
                }

            }

            else if(ch==')'){

                if(st.size() == 0){
                    System.out.println(false);
                    return;
                }

                else if(st.peek()!='('){
                    System.out.println(false);
                    return;
                }

                else{
                    st.pop();
                }

            }
            
            else if(ch=='}'){

                if(st.size() == 0){
                    System.out.println(false);
                    return;
                }

                else if(st.peek()!='{'){
                    System.out.println(false);
                    return;
                }

                else{
                    st.pop();
                }

            }

        }

        if(st.size() !=0)
        System.out.println(false);

        else
        System.out.println(true);

    }

}