package Searching;
import java.util.Scanner;
public class linearSearch {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter target element:");
       int x=sc.nextInt();

       System.out.println("Enter size of array:");
       int n= sc.nextInt();

       int[] arr=new int[n];

       System.out.println("Enter array elemets:");
       for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
        
       }


       // Solution
       boolean flag=false; //false means not found
       for (int i = 0; i < n; i++) {

        if(arr[i]==x){
            flag=true; //true means found
            break;

        }
        
       }

       if(flag==true) { System.out.println("Element found"); }
       else { System.out.println("Element not found");  }


    
    sc.close();
    
}
}
