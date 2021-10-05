import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean ispalindrome(String SPS){
        
        int i=0;
        int j=SPS.length()-1;
        
        
        while(i<=j){
            char s=SPS.charAt(i);
            char e=SPS.charAt(j);
            
            if(s!=e){
                return false;
            }
            
            else{
                i++;
                j--;
            }
            
        }
        return true;
        
    }

	public static void solution(String str){
		//write your code here
		
		
		for(int i=0;i<str.length();i++){
		    
		    for(int j=i+1;j<=str.length();j++){
		        String SPS=str.substring(i,j);
		        
		        if(ispalindrome(SPS)){
		            System.out.println(SPS);
		        }
		    }
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}