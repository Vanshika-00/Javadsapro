package twoDimArray;
//Leetcode 73. Set Matrix Zeroes

public class setMatrixZero {

    public static void main(String [] args){

        int [] [] arr={{1,2,2,0,2},{3,0,2,1,9},{6,10,7,0,8},{0,4,19,3,99}};

        int m=arr.length,n=arr[0].length;
        boolean zeroRow = false, zeroCol=false;

        //Check the 0th row
        for(int j=0;j<n;j++){
            if(arr[0][j]==0){
                zeroRow=true;
                break;
            }
        }

        //Check the 0th column
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                zeroCol=true;
                break;
            }
        }

        //Travel in submatrix
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        //Travel in 0th row
        for(int j=1;j<n;j++){
            if(arr[0][j]==0){
                for(int i=1;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }

        //Travel in 0th column
        for(int i=1;i<m;i++){
            if(arr[i][0]==0){
                for(int j=1;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }

        if (zeroRow==true){
            for(int j=0;j<n;j++){
                arr[0][j]=0;
            }
        }

        if (zeroCol==true){
            for(int i=0;i<m;i++){
                arr[i][0]=0;
            }
        }

    }

    
    
}
