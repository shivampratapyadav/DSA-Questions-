import java.util.Scanner;

public class cwa07PrintDigitsOfANumber {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        //System.out.println("Enter the number you want to print digits of :");
        int d,num,n = scn.nextInt();
        num=n;

        for(d=0;n>0;d++){
            n=n/10;
        }

        for(int i=d;i>=1;i--){
            int q;

            q=num/(int)Math.pow(10,i-1);
            System.out.println(q);
            num=num%(int)Math.pow(10,i-1);
     }
    }
}