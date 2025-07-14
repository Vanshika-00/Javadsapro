package Conditional;

import java.util.Scanner;

public class ternary {

    public static void main(String[] args) {
        
    
    
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the Num:");
    int n=scan.nextInt();

    System.out.println((n%2==0)? "Even":"Odd");
    scan.close();
    
}
}
