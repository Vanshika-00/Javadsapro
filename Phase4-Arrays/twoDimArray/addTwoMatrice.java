package twoDimArray;

public class addTwoMatrice {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int m = a.length; // number of rows
        int n = b[0].length; // number of columns

        int[][] res = new int[m][n]; // Array to store the sum of the two matrices

        // Adding the two matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        // Printing the resulting matrix
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
