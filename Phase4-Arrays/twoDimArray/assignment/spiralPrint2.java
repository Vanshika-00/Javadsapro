package twoDimArray.assignment;
public class spiralPrint2 {
     public static void print (int[][]arr){
       
        int n = 3; // number of rows
        

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
}

public static void main(String[]args){

    

        
        int n=3;
        int arr[][]=new int[n][n];
        int val=1;
        
       

        //spiral print
       
        int minr=0,maxr=n-1;
        int minc=0,maxc=n-1;

        while(minr<=maxr && minc<=maxc){

            //left to right
            for(int j=minc;j<=maxc;j++){
                arr[minr][j]=val++;
            } minr++;

            //top to bottom
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
               arr[i][maxc]=val++;
            } maxc--;

            //right to left
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                arr[maxr][j]=val++;
            } maxr--;


           //top to bottom
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
               arr[i][minc]=val++;
            } minc++;
        }

        print(arr);

}
}