package Conditional;

import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=scan.nextInt();
        
        
        System.out.print("Enter second number:");
        int b=scan.nextInt();
        
      
        System.out.print("Enter third number:");
        int c=scan.nextInt();

        if(a>=b && a>=c) System.out.println(a + " is greatest");
        else if(b>=a && b>=c) System.out.println(b + " is greatest");
        else System.out.println(c + " is greatest");

        scan.close();
    }
    
}
