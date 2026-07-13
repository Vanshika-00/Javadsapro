package twoDimArray;

public class transformIntoTranspose {

    public static void print (int[][]arr){
       
        int m = arr.length; // number of rows
        

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){

         //transpose

        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        int m = arr.length;
        
        System.out.println();

        
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);

        System.out.println();
    

        for (int i = 0; i < m; i++) {
            int a=0,b=m-1;
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }

            

            
        }
        print(arr);
        
    }
}