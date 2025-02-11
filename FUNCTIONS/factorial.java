package JAVAANDDSA.FUNCTIONS;
import java.util.*;
public class factorial {
    public static int calculatefactorial(int n) {  
        int fact = 1 ;
        for(int i=1 ; i <= n ; i++){
            fact = fact * i ;
           } return fact;
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int fact = calculatefactorial(n);
        System.out.println("factorial is "+fact);
    }

}
