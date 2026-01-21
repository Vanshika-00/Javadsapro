// Second Method:

public class maxInArray2 {

    public static void main(String[] args) {

        int[] arr = {-72,-73,-27,-82,-8,-37,-38,-29};
        int mx=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i = 0; i < n; i++) {

            mx=Math.max(mx,arr[i]);
            
        }

        System.out.println("The maximum value in the array is: " + mx);
        
    }

    


    
}
