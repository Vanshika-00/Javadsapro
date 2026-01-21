//Find the max value out of the given array


//method 1:
public class maxInArray {
    public static void main(String[] args) {

        int[] arr={18,72,83,62,72,63,33,83,72};
        int n=arr.length;
        int mx=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>mx) mx=arr[i];
            
        }

        System.out.println("Maximum element in the array is: "+mx);
        
    }  
}

