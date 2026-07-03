
//Q6. Count the number of elements strictly greater than x.
public class countGreatNum {

    public static int countGreaterThanX(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 8, 41, 37, 2, 49, 16, 28, 21 };
        int x = 20;
        int count = countGreaterThanX(arr, x);
        System.out.println("Number of elements strictly greater than " + x + ": " + count);
    }
    
}
