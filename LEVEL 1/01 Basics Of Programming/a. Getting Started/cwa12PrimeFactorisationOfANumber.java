mport java.util.Scanner;
public class cwa12PrimeFactorisationOfANumber {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n,i;
        n=scn.nextInt();
        for(i=2;i*i<=n;i++)
        {
            while(n%i==0){

                n=n/i;
                System.out.print(i+" ");
            }

        }

        if(n!=1)
            System.out.print(n);
    }
}