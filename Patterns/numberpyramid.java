public class numberpyramid {
    public static void main(String[] args) {
        int a = 5;
        for(int i = 0; i<= a;i++){
            for(int j = 1 ;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}