public class sortZeroOneTwo2 {
    public static void main(String[] args){

        int [] arr= {0,1,2,0,1,2,0,1,2};
        int n = arr.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
