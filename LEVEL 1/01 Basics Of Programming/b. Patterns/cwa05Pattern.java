import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        // write ur code here
        
        int n= scn.nextInt();
        
        for(int i=1;i<=(n/2)+1;i++) {
            
            for(int j=1;j<=(n/2)+i;j++) {
                
                if(j<=(n/2)+1-i)
                {
                    System.out.print("\t");
                }
                
                else
                    System.out.print("*\t");
                    
            }
            
            System.out.println();
            
        }
        
        for( int i=(n/2);i>=1;i--) {
            
            for(int j=1;j<=(n/2)+i;j++) {
                
                if(j<=(n/2)+1-i)
                {
                    System.out.print("\t");
                }
                
                else
                    System.out.print("*\t");
                    
            }
            
            System.out.println();
            
        }
    }
}