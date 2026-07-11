package twoDimArray;
public class wavePrint{
     public static void print (int[][]arr){
       
        int m = arr.length; // number of rows
        int n = arr[0].length; // number of columns

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
      }
    public static void main(String[]args){
         int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                } }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            
        }
      
    

    }
}