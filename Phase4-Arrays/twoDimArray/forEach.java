package twoDimArray;

public class forEach {
    
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Using for-each loop to iterate through the 2D array
        for (int[] row : arr) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    
}
