import java.util.Scanner;
public class cwa10RotateANumberKTimes {
    public static void main(String[] args){

        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int num=n,d;

        for(d =0;n>0;d++)
        {
            n=n/10;
        }

        //Value of d is now equal to number of digits of the entered number.
        if(k>d){
            k=k%d;
        }

        if(k<0){
            k=k%d;
            k=k+d;
        }

        int rotation_digits = num%(int)Math.pow(10,k);
        int n_num=num/(int)Math.pow(10,k);
        int rotated_num=(rotation_digits*(int)Math.pow(10,d-k)+n_num);
        System.out.println(rotated_num);

    }
}