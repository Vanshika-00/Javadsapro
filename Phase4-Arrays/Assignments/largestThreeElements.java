
import java.util.Arrays;

public class largestThreeElements {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90, 67};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        findLargestThree(arr);
    }

    public static void findLargestThree(int[] arr) {
        int n = arr.length;

        // An array must have at least 3 elements to find the top 3
        if (n < 3) {
            System.out.println("Invalid Input: Array should have at least 3 elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int current = arr[i];

            // Case 1: Current element is greater than the largest element found so far
            if (current > first) {
                third = second;
                second = first;
                first = current;
            }
            // Case 2: Current element is between first and second
            else if (current > second) {
                third = second;
                second = current;
            }
            // Case 3: Current element is between second and third
            else if (current > third) {
                third = current;
            }
        }

        System.out.println("The three largest elements are: " + first + ", " + second + ", " + third);
    }
}