import java.util.Scanner;

public class cwa11GCDandLCM {
    public static void main( String[] args){

        Scanner scn = new Scanner(System.in);

        int num1= scn.nextInt();
        int num2= scn.nextInt();
        int divident,divisor,remainder;
        divident=num1;
        divisor=num2;


        while( divident % divisor!=0){
            remainder= divident%divisor;
            divident=divisor;
            divisor=remainder;


        }

        int GCD=divisor;
        int LCM=(num1*num2)/divisor;

        System.out.println(GCD);
        System.out.println(LCM);

    }
}