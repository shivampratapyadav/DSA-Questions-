/*
01-11-2021
MONDAY

QUESTION --> Arrange Buildings :

1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.

Input Format:
A number n

Output Format:
A number representing the number of ways in which the buildings can be built on both side of roads.

Constraints:
0 < n <= 45

Sample Input:
6

Sample Output:
441

*/

import java.util.*;
public class cwa13ArrangeBuildings {
    public static void main(String[] args)throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        long osb=1;
        long oss=1;

        for(int i=2;i<=n;i++) {

            long nsb = oss;
            long nss = osb+oss;

            osb = nsb;
            oss = nss;
        }

        System.out.println((osb+oss)*(osb+oss));

    }
}