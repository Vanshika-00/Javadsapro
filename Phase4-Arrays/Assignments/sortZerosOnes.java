public class sortZerosOnes {

    public static void main(String[] args){

        int [] arr= {0,1,0,1,0,1,0,1};
        int n = arr.length;
        int noOfZeros=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                noOfZeros++;
            }
        }
        for(int i=0;i<noOfZeros;i++){
            arr[i]=0;
        }
        for(int i=noOfZeros;i<n;i++){
            arr[i]=1;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }  
}
