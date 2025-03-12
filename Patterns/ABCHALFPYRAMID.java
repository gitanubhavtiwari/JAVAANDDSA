public class ABCHALFPYRAMID {
    public static void main(String[] args) {
        int a = 5;
        char ch ='A';;
        for(int i = 0; i<= a;i++){
            for(int j = 1 ;j<=i;j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
//output 
// A 
// BC 
// DEF 
// GHIJ 
// KLMNO 
