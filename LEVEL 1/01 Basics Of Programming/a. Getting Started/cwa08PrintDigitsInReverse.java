import java.util.Scanner;

public class cwa8PrintReverseDigitsOfANumber {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number you want to count digits of :");
        int d,num,n = scn.nextInt();
        num=n;

        for(d=0;n>0;d++){
            n=n/10;
        }

        for(int i=1;i<=d; i++){
            System.out.println(num%10);
            num=num/10;
        }
    }
}