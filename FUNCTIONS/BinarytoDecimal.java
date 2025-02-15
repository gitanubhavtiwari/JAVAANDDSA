package JAVAANDDSA.FUNCTIONS;

public class BinarytoDecimal {

    public static int BINTODECI(int n) {
        int t = n ,d = 0;
        for(int i=0; t>0;i++ ){
            int r = t%10;
            t=t/10;
            d= d + r* (int)Math.pow(2,i);
        }
        return d;
    }
    
    
    
    
    public static void main(String[] args) {
       int d = BINTODECI(1111);
        System.out.println(d);
    }
}
