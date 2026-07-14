package twoDimArray.assignment;

public class add {

    public static void main(String[] args){

        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
        int m = arr1.length;
        int n = arr1[0].length;

        int[][] sum = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

     }
    
}
