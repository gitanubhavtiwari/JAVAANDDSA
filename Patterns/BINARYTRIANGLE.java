public class BINARYTRIANGLE {
    public static void binarytriang (int row ){
        
         for(int i = 1; i<= row; i++) {
              
             for(int j = 1; j<=i ;j++){
                 if((i+j)%2==0){
                     System.out.print("1");
                 }
                 else{
                     System.out.print("0");
                 }
             }
               System.out.println("");
         }
       
     }
     
     public static void main (String args[]) {
     binarytriang(5);
         
     }
}
//output
// 1
// 01
// 101
// 0101
// 10101