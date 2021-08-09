/*09-08-2021
MONDAY
_________________________________________________________________________________________________
QUESTION : 
1. You are given as input marks of a student.
2. Display an appropriate message based on the following rules:
  	  2.1 for marks above 90, print excellent.
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.




Input Format:
Input is handled for you and provided as variable marks.

Output Format:
Appropriate message as per student's marks.


Sample Input:
92

Sample Output:
excellent
_________________________________________________________________________________________________
*/


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      
    // input - don't change this code
    Scanner scn = new Scanner(System.in);
    int marks = scn.nextInt();
    // input - don't change this code
      
    // code here
      
    if(marks>90)
    System.out.print("excellent");
      
    else if(marks>80)
    System.out.print("good");
      
    else if(marks>70)
    System.out.print("fair");
      
    else if(marks>60)
    System.out.print("meets expectations");
      
    else
    System.out.print("below par");
    
    }
}


