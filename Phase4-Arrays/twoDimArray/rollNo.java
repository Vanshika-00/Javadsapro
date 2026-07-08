package twoDimArray;
import java.util.Scanner;

public class rollNo{

    public static void main(String [] args){

        int[][] arr = new int[4][2];

        Scanner sc = new Scanner(System.in);

        int m=arr.length;
        int n=arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();

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