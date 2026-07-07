package twoDimArray;
import java.util.Scanner;

public class outputNestedLoops {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int [3][3];

        int m = arr.length; // number of rows
        int n = arr[0].length; // number of columns

        // Taking input for the 2D array
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
          
          // Printing the 2D array
          for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
