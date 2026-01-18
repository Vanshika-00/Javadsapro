public class basicSyntax{
    public static void main(String[] args) {
        
        // Initialising individual elements of an array
        int[] arr = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        

        //Output of array elements
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.print(arr[4]+" ");

        arr[0]=99;
        arr[0]+=10;
        System.out.println("\nUpdated first element: " + arr[0]);


    }
}