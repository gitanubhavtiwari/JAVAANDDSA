package JAVAANDDSA.ARRAY;

public class BinarySearch {
    public static int binarysearch(int numbers[], int key) {
        int start = 0 ,  end = numbers.length-1;
        
        while(start <= end) {
            int mid = (start + end) / 2 ;
        
        if( numbers[mid] == key ) {
            return mid; 
        }
        
        if( numbers[mid] < key ) {
            start = mid + 1 ;
        }
        else {
            end = mid - 1 ;
        }
        
    }
     return -1;
    }
    
    public static void main(String args[]) {
        int numbers[] = {1,2,3,45,65,78,90};
        int key = 45;
        System.out.println("the index of key is " + binarysearch(numbers,key));
        
}
}
