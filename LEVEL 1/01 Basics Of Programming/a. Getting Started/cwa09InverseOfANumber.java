import java.util.Scanner;
public class cwa9InverseOfANumber {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int num=n,i;

        for(i =0;n>0;i++)
        {
            n=n/10;
        }

        //Value of i is now equal to number of digits of the entered number.
        int inv=0;
        for(int j =1;j<=i;j++){

            int d=num%10;
            num=num/10;
            inv=inv+(j*((int)Math.pow(10,d-1)));
        }
        System.out.println(inv);

    }
}