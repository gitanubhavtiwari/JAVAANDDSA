import java.util.Scanner;
public class AVERAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter First Number");
        int a = sc.nextInt();
        System.err.println("Enter Second Number");
        int b = sc.nextInt();
        System.err.println("Enter third number");
        int c = sc.nextInt();
        int Average = (a+b+c)/3;
        System.err.println("Average is"+Average);
        sc.close();
    }
}
