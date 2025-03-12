public class invertedhalfnumpyr {
    
    public static void invertednumpy (int row ){
        
        for(int i = 1; i<= row; i++) {
             
            for(int j = 1; j <= row-i+ 1;j++){
                
                System.out.print(j);
                
            }
              System.out.println("");
        }
      
    }
    
    public static void main (String args[]) {
    invertednumpy(5);
        
    }
    
}
// output
// 12345
// 1234
// 123
// 12
// 1