import java.util.Scanner;

public class cwa13PythagoreanTriplet {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt(), b=scan.nextInt(), c=scan.nextInt();

        int max = a;
        max= Math.max(a,b);
        max=Math.max(max,c);

        if(max==a)
        {
            Boolean pythagorean_triplet = ((b * b + c * c) == (a * a));
            System.out.println(pythagorean_triplet);
        }

        else if(max==b)
        {
            Boolean pythagorean_triplet = ((a * a + c * c) == (b * b));
            System.out.println(pythagorean_triplet);
        }

        else
        {
            Boolean pythagorean_triplet = ((b * b + a * a) == (c * c));
            System.out.println(pythagorean_triplet);
        }


    }
}