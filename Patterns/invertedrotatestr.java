public class invertedrotatestr {
    public static void inverted_rotated_half_pyramid (int row ){
        
        for(int i = 1; i<= row; i++) {
             
            for(int j = 1; j <= row-i;j++){
                
                System.out.print(" ");
                
            }
            
            for(int k = 1; k <=i;k++){
                
                System.out.print("*");
                
            }
              System.out.println("");
        }
      
    }
    
    public static void main (String args[]) {
    inverted_rotated_half_pyramid(5);
        
    }
    
}
// output
//     *
//    **
//   ***
//  ****
// *****