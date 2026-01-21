public class secMax {
    public static void main(String[] args) {

        int[] arr = {18, 72, 83, 62, 72, 63, 33, 83, 72};
        int n=arr.length;

        int mx=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            mx=Math.max(mx,arr[i]);
            
        }

        int smx=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
           if(arr[i]<mx){
            smx=Math.max(smx,arr[i]);
           }
            
        }

        System.out.println("The first maximum value in the array is: " + mx);

        System.out.println("The second maximum value in the array is: " + smx);



    
        
    }
    

   

}
