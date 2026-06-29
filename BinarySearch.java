import java.util.Scanner;

public class BinarySearch {
    

    public static int binarySearchProgram(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if ( target==arr[mid] ) {
                
                return mid;
            }

            if (target >arr[mid] ) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        
        return -1;
    }
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int [] arr = {10, 20, 30, 60, 90, 100, 130, 170};
        System.out.println("Enter the number to be searched:");
        int target = 100;

        int res = binarySearchProgram(arr, target);
        if (res == -1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + res);
        }
    }
}