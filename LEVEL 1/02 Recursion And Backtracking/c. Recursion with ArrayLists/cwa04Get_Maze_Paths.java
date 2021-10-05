/*
20-09-2021
MONDAY

QUESTION -> Get Maze Paths:

1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Input Format:
A number n
A number m

Output Format:
Contents of the arraylist containing paths as shown in sample output.

Constraints:
0 <= n <= 10
0 <= m <= 10

Sample Input:
3
3

Sample Output:
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]

*/

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> Maze_Paths = getMazePaths(1, 1, n, m);

        System.out.print(Maze_Paths);
    }


    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sc==dc && sr==dr){
            ArrayList<String> Ipath = new ArrayList<>();
            Ipath.add("");

            return Ipath;
        }


        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();

        if(sc<dc)
        hPaths = getMazePaths(sr, sc+1, dr, dc);

        if(sr<dr)
        vPaths = getMazePaths(sr+1, sc, dr, dc);

        ArrayList<String> paths = new ArrayList<>();

        for(String hPath : hPaths){
            paths.add("h" + hPath);
        }

        for(String vPath : vPaths){
            paths.add("v" + vPath);
        }

        return paths;
    }

}
