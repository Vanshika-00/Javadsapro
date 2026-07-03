//Q. Check if the given array is sorted or not
public class sortedOrNot {
    
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Array is not sorted
            }
        }
        return true; // Array is sorted
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        boolean sorted = isSorted(arr);
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    
}
