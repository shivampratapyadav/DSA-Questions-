import java.util.Scanner;

public class cwa4PrintPrimesBTW2numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int high,low;
        System.out.println("Enter the first number of the list you want to check whether prime or not:");
        low=scn.nextInt();
        System.out.println("Enter the last numbers of the list you want to check whether prime or not:");
        high =scn.nextInt();

        int i;
        for(i=low;i<=high;i++)
        {
            int j;

            for(j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    //System.out.println("not prime");
                    break;
                }

            }


            if(j*j>i)
                System.out.println(i);

        }
    }
}