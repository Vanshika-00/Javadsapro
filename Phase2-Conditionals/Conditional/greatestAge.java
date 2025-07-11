package Conditional;

import java.util.Scanner;

public class greatestAge {

    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.print("Enter Ram's age:");
        int a=scan.nextInt();
        
        
        System.out.print("Enter Sham's age:");
        int b=scan.nextInt();
        
      
        System.out.print("Enter Ajay's age:");
        int c=scan.nextInt();

        if (a<=b && a<=c) System.out.println("Ram is youngest");
        if (b<=a && b<=c) System.out.println("Sham is youngest");
        if (c<=b && c<=a) System.out.println("Ajay is youngest");

        scan.close();
    }
    
    
}
