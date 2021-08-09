/*
09-08-2021
MONDAY
_________________________________________________________________________________________________
QUESTION : 
Is A Number Prime

1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.


Input Format:
A number t
A number n
A number n
.. t number of times.

Output Format:
prime
not prime
not prime
.. t number of times.


Constraints:
1 <= t <= 10000
2 <= n < 10^9

Sample Input:
5
13
2
3
4
5

Sample Output:
prime
prime
prime
not prime
prime
_________________________________________________________________________________________________
*/


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
  
        int n,t;
        t=scn.nextInt();



        for(int i=0;i<t;i++) {
            //System.out.println("Enter the " + (i + 1) + " number you want to check for Prime: ");
            n = scn.nextInt();
            int j;

            for (j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    System.out.println("not prime");
                    break;
                }
            }
            
            if (j * j > n)
            System.out.println("prime");
        }
    }
  }