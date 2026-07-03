/* Q. Find the unique number in a given Array where all the elements are being repeated twice with one value
being unique.*/

public class findUniqueXor {

   
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        
        int unique = 0;

        // XOR every element in the array
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i]; // Can also be written as unique ^= arr[i];
        }

        System.out.println("The unique element is: " + unique);
    }
}
    

