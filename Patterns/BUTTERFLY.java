public class BUTTERFLY {
    public static void pyramid (int n){
        for(int i=1 ; i<=n ; i++ ){
            
            for(int j=1; j<=i ; j ++) {
                System.out.print("*");
            }
            
             for(int k =1 ; k<=(n-i)*2 ; k++ ){
                 System.out.print(" ");
                
           }
           
           for(int j=1; j<=i ; j ++) {
                System.out.print("*");
            }
           
            System.out.println("");
    }
      for(int i=n; i>=1; i--){
          for(int j=1; j<=i ; j ++) {
                System.out.print("*");
            }
            
             for(int k =1 ; k<=(n-i)*2 ; k++ ){
                 System.out.print(" ");
                
           }
           
           for(int j=1; j<=i ; j ++) {
                System.out.print("*");
            }
           
            System.out.println("");
      }
    

    }
    public static void main(String[] args) {
       pyramid(6);
    }
}
