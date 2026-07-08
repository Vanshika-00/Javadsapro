package twoDimArray;
public class transpose {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            
        };

        int m = arr.length; // number of rows
        int n = arr[0].length; // number of columns

        int[][] transpose = new int[n][m]; // Array to store the transposed matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[i][j] = arr[j][i];
            }
        }

         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        
}
}
