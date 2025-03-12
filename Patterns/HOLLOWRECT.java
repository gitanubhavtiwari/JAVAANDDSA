import java.util.Scanner;

class HOLLOWRECT {
        public static void hollowrectangle (int row, int column) {
        //outer loop
        for(int i = 1 ; i <= row ; i ++){
            //inner loop
            for(int j = 1; j<=column; j++){
                //condition for  boundaries
                if(i == 1|| i == row || j == 1 || j == column ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println("");   
        }
    } 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        
    hollowrectangle(row,column);
    sc.close();
    }
    
      
}
// output
// 5
// 5
// *****
// *   *
// *   *
// *   *
// *****
