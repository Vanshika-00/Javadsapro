public class ques1{
    public static void main(String[] args) {
        
        int[] arr = {12,45,67,23,5,53,34};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]<35) {
                System.out.print(i +" ");
            }
        }
    }
}