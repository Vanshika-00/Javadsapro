//Q3. Given a matrix ‘A’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the
//rectangle from (l1,r1) to (l2, r2).

package twoDimArray.assignment;

public class sumOfCoordinates {
    public static void main(String[] args){

        int[][] arr = {{1,2,-3,4},{0,0,-4,2},{1,-1,2,3 },{-4,-5,-7,0}};
        int l1=1,r1=0,l2=0,r2=3;
        
        // Find the true top-left and bottom-right boundaries
        int a = Math.min(l1, l2); // The smaller row index becomes the start
        int c = Math.max(l1, l2); // The larger row index becomes the end

        int b = Math.min(r1, r2); // The smaller column index becomes the start
        int d = Math.max(r1, r2); // The larger column index becomes the end
        int sum=0;

        for(int i=a;i<=c;i++){
            for(int j=b;j<=d;j++){
                sum+=arr[i][j];
            }
        }

        
        System.out.println(sum);


    
}
}
