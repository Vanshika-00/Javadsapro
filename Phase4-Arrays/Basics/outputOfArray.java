import java.util.Scanner;
public class outputOfArray {

    public static void main(String[] args) {
        
    

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter array size:");
    int n=sc.nextInt();

    int[] arr= new int[n];


    //input loop
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
   //output loop

    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

    sc.close();

    
}
}
