package Conditional;
import java.util.Scanner;


public class absoluteValue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=scan.nextInt();

        if(n<0) System.out.println(-n);
        else System.out.println(n);

        scan.close();
    
    }
    
}
