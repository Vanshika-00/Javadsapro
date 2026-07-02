public class nextGreatestElement2 {
    public static void main (String[] args){

        int arr []= {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int [] ans = new int[n];
        ans [n-1]=-1;

        for (int ele:arr){
            System.out.print(ele+" ");
        }

        System.out.println();
        int nge = arr[n-1];

        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);

        }


        // Print the result
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
    
}
