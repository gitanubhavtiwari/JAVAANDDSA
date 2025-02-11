package JAVAANDDSA.FUNCTIONS;

import java.util.Scanner;

public class BINOMIALCOEFFICIENT {
    
      public static int calculatefactorial(int n) {  
        int fact = 1 ;
        for(int i=1 ; i <= n ; i++){
            fact = fact * i ; 
           } return fact;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int factn = calculatefactorial(n);
        
        int r = sc.nextInt();
        int factr = calculatefactorial(r);
        
         int factnr = calculatefactorial(n-r);
         
         int d =factn/(factr*factnr);   
         System.out.println("your binomial coefficient is" +d);
        
    }
}          
         