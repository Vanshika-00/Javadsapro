
//Q5. Write a program to print the row number having the maximum sum in a given matrix.
package twoDimArray.assignment;

public class largestSum {

    public static void main(String[] args){

        int[][] arr = {{1,3,5,7},{3,4,7,8},{1,4,12,3 }};
        int m = arr.length;
        int n = arr[0].length;

        int maxSum=Integer.MIN_VALUE;
        int rowIndex=-1;

        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                rowIndex=i+1; // Adding 1 to convert from 0-based index to 1-based row number
            }
        }

        System.out.println("Row with maximum sum: " + rowIndex);
    }
    
}
