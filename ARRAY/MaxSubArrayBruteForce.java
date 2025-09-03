public class MaxSubArrayBruteForce {

        public static void MaxSubArrayBruteFor(int numbers[]) {
        int Maxsum = Integer.MIN_VALUE; 

      
        for (int i = 0; i < numbers.length; i++) {
 
            for (int j = i; j < numbers.length; j++) {
                int currsum = 0; 

                for (int k = i; k <= j; k++) {
                    currsum += numbers[k];
                }

                System.out.println("Subarray (" + i + ".." + j + ") sum = " + currsum);

                if (currsum > Maxsum) {
                    Maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + Maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 7, 3, 9};
        MaxSubArrayBruteFor(numbers);
    }

}
