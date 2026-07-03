public class calculateProd {
    public static void main (String[] args ){

         int[] arr = {18, 72, 83, 62, 72, 63, 33, 83, 72};
         long product = 1;
         int n = arr.length;
         for (int i = 0; i < n; i++) {
             product *= arr[i];
         }
         System.out.println("Product of array elements: " + product);
    }
}