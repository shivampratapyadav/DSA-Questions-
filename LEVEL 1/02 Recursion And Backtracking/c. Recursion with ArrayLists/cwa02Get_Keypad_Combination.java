/*
20-09-2021
MONDAY

QUESTION -> Get Kpc :

1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.

Input Format:
A string str

Output Format:
Contents of the arraylist containing words as shown in sample output

Constraints:
0 <= str.length <= 10
str contains numbers only

Sample Input:
78

Sample Output:
[tv, tw, tx, uv, uw, ux]

*/

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        String str = scn.next();
        
        ArrayList<String> kpc = getKPC(str);
        
        System.out.print(kpc);
    }
    
    static String codes [] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"} ;
    
    public static ArrayList<String> getKPC(String str) {
        
        if(str.length()==0){
            ArrayList<String> ikp = new ArrayList<>();
            
            ikp.add("");
            
            return ikp;
        }
        
        char ch = str.charAt(0);
        
        ArrayList<String> kpci = getKPC(str.substring(1));
        
        ArrayList<String> kp = new ArrayList<>();
        
        String cs = codes[ch-'0'];
        
        for(int i=0;i<cs.length();i++){
            
            char c1 = cs.charAt(i);
            
            for(String st : kpci){
                kp.add(c1+st);
            }
            
        }
        
        return kp;
    }

}