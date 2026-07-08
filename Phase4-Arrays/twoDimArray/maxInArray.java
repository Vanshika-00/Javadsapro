package twoDimArray;

public class maxInArray {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 10}
        };

        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value 
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;

        // Iterate through the 2D array to find the maximum value
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                sum += arr[i][j];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The sum of all elements in the array is: " + sum);
    }
    
}
