package twoDimArray.assignment;

public class diagonalPrint {
    public static void main (String[] args){

    int[][] arr= {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };


   int n = arr.length;
   for (int i = 0; i < n; i++) {
    for(int j=0;j<n;j++){
        if(i==j || i+j==n-1){
            System.out.print(arr[i][j]+" ");
        }else{
            System.out.print("  ");
        }
    }
    System.out.println();
   }    
}
}