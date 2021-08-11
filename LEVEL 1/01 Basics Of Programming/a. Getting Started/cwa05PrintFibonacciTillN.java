import java.util.Scanner;
public class cwa5PrintFibonacciTillN {
    public static void main(String[] arg){
        // write your code here
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the total number of Fibonacci Numbers you want to print :");
        int n = scn.nextInt();

        int s,e,sum;
        s=0;
        e=1;


        for(int i=0;i<n;i++){
            System.out.println(s);
            sum=s+e;
            s=e;
            e=sum;
        }
    }
}