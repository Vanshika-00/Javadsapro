public class sortZeroOneTwo {
    public static void main(String[] args){
        
        int [] arr= {0,1,2,0,1,2,0,1,2};
        int n = arr.length;
        int noOfZeros=0;
        int noOfOnes=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                noOfZeros++;
            }
            else if(arr[i]==1){
                noOfOnes++;
            }
        }

        for(int i=0;i<n;i++){
            
            if(i<noOfZeros){
                arr[i]=0;
            }
            else if(i<noOfZeros+noOfOnes){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
