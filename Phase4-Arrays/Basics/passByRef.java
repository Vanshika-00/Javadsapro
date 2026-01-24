public class passByRef {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(arr[0]); // Output: 10
       
        // Passing array to method;
        change(arr);
        System.out.println(arr[0]); // Output: 90
        


    }

    public static void change(int[] x ){
        x[0]=90;
    }
    
}
    