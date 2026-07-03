// Q. WAP to find the smallest missing positive element in the sorted Array. (take the array as input)

public class missingFirstEle {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int missingElement = findMissingPositive(arr, n);
        System.out.println("The smallest missing positive element is: " + missingElement);
    }

    public static int findMissingPositive(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1; // If all elements are present
    }
}