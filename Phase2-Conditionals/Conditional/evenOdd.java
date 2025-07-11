package Conditional;
import java.util.Scanner;
public class evenOdd {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=scan.nextInt();

        if(n%2==0) System.out.println("Even");
        if(n%2!=0) System.out.println("Odd");

        scan.close();
    }
}
