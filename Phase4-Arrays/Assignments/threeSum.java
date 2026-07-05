import java.util.Arrays;

public class threeSum {
    public static void findTriplets(int[] arr, int x) {
        int n = arr.length;
        
        // Step 1: Sort the array
        Arrays.sort(arr);
        boolean found = false;

        // Step 2: Fix the first element
        for (int i = 0; i < n - 2; i++) {
            
            // Skip duplicate elements for the first position to avoid duplicate triplets
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // Step 3: Initialize two pointers
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == x) {
                    System.out.println("Triplet found: [" + arr[i] + ", " + arr[left] + ", " + arr[right] + "]");
                    found = true;

                    // Skip duplicate elements for the left pointer
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    // Skip duplicate elements for the right pointer
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    // Move both pointers inward after finding a valid triplet
                    left++;
                    right--;
                } 
                // Step 4: Adjust pointers based on the sum
                else if (currentSum < x) {
                    left++; // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }

        if (!found) {
            System.out.println("No triplets found with the sum " + x);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int target = 24;
        
        // Sorted array becomes: [1, 3, 4, 6, 9, 12]
        findTriplets(arr, target); 
    }
    
}
