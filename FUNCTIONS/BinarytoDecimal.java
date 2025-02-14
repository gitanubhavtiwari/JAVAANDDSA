package JAVAANDDSA.FUNCTIONS;

public class BinarytoDecimal {
    public static void main(String[] args) {
        int n = 111001; 
        int t = n ,d = 0;
        for(int i=0; t>0;i++ ){
            int r = t%10;
            t=t/10;
            d= d + r* (int)Math.pow(2,i);
        }
        System.out.println(d);
    }
  
}
