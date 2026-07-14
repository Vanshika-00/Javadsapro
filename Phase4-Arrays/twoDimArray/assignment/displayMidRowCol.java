package twoDimArray.assignment;

public class displayMidRowCol {
    public static void main(String[] args) {
        // Sample 5x5 matrix from your assignment image
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {3, 4, 5, 6, 7},
            {7, 6, 5, 4, 3},
            {8, 7, 6, 5, 4},
            {1, 2, 37, 8, 0}
        };
        int n = arr.length;

        displayMidEle(arr, n);
    }

    public static void displayMidEle(int[][] arr, int n) {
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            // Case 1: If it's the middle row, print all elements horizontally
            if (i == mid) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } 
            // Case 2: For all other rows, print spaces up to the middle column, then print the number
            else {
                // Print double spaces to match the character + space width of the rows
                for (int j = 0; j < mid; j++) {
                    System.out.print("  "); 
                }
                // Print the middle column element and move to the next line
                System.out.println(arr[i][mid]);
            }
        }
    }
}