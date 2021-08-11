import java.util.Scanner;
public class cwa6CountDigitsInANumber {
    public static void main(String[] args){

        // write your code here

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number you want to count digits of :");
        int i,n = scn.nextInt();


        for(i=0;n>0;i++){
            n=n/10;
        }

        int d=i;
        System.out.println(d);

    }
}