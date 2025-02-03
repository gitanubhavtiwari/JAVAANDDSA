public class square { // Class name starts with uppercase
    public static void main(String[] args) { // Added main method
        int size = 4; // Size of the square

        for (int i = 1; i <= size; i++) { // Outer loop for rows
            for (int j = 1; j <= size; j++) { // Inner loop for columns
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}