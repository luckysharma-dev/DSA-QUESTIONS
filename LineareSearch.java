public class LineareSearch{
    public static void main(String[] args) {
    int[] data = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
    int target = 170;

    int result = linearSearch(data, target);
     int max = findMax(data);
    System.out.println("Maximum value in the array is: " + max);

    if (result != -1) {
        System.out.println("Element found at index " + result);
    } else {
        System.out.println("Element not found");
    }
}

    public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i; 
        }
    }
    return -1; 
}
static int findMax(int arr[]) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
// public static void main(String[] args) {
//     int[] data = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
//     int target = 170;

//     int result = linearSearch(data, target);

//     if (result != -1) {
//         System.out.println("Element found at index " + result);
//     } else {
//         System.out.println("Element not found");
//     }
// }
}