//Q Find the difference between the sum of elements at even indices to the sum of elements at odd indices.

public class indicesDiff {
    public static void main(String[] args) {
        // 1. Define your array locally inside main
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        int evenSum = 0;
        int oddSum = 0;

        // 2. Loop through the array directly
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i]; // Adds elements at index 0, 2, 4...
            } else {
                oddSum += arr[i];  // Adds elements at index 1, 3, 5...
            }
        }

        // 3. Calculate and print the result right here
        int difference = evenSum - oddSum;
        System.out.println("The difference is: " + difference);
    }
}