import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
    pattern(n);
        
    }
    
    
    public static void pattern(int n){
        if(n==0){
        return;
        }
        
        pattern(n-1);
            
          pattern(n-1);
          System.out.print("*\t");
        
    }
}