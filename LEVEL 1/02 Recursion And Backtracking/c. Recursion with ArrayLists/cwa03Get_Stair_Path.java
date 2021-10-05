/*
20-09-2021
MONDAY

QUESTION -> Get Stair Paths:

1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Input Format:
A number n

Output Format:
Contents of the arraylist containing paths as shown in sample output

Constraints:
0 <= n <= 10

Sample Input:
3

Sample Output:
[111, 12, 21, 3]

*/


import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<String> gSP = getStairPaths(n);
        System.out.print(gSP);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0) {

            ArrayList<String> gsp = new ArrayList<>();
            
            gsp.add("");
            
            return gsp;

        }
        
        else if(n<0) {

            ArrayList<String> gs = new ArrayList<>();
            return gs;

        }
        
        ArrayList<String> gs1 = getStairPaths(n-1);
        ArrayList<String> gs2 = getStairPaths(n-2);
        ArrayList<String> gs3 = getStairPaths(n-3);
        
        ArrayList<String> stair_paths = new ArrayList<>();

        for(String s : gs1){
            stair_paths.add(1+s);
        } 

        for(String s : gs2){
            stair_paths.add(2+s);
        } 

        for(String s : gs3){
            stair_paths.add(3+s);
        } 


        return stair_paths;
    }

}