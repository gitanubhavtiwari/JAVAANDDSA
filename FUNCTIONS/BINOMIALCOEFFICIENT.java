package JAVAANDDSA.FUNCTIONS;

import java.util.Scanner;

public class BINOMIALCOEFFICIENT {
    
      public static int calculatefactorial(int n) {  
        int fact = 1 ;
        for(int i=1 ; i <= n ; i++){
            fact = fact * i ; 
           } return fact;
        
    }
    public static int BINOMCOEFF(int n , int r) {
        int factn = calculatefactorial(n);   
        int factr = calculatefactorial(r);
        int factnr = calculatefactorial(n-r);
        int d =factn/(factr*factnr); 
        return d;     
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int d = BINOMCOEFF(n, r);
        System.out.println("your binomial coefficient is" +d);
        
    }
}          
         