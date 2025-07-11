package Conditional;

import java.util.Scanner;

public class greatestOfThreeNestedIfElse {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=scan.nextInt();
        
        
        System.out.print("Enter second number:");
        int b=scan.nextInt();
        
      
        System.out.print("Enter third number:");
        int c=scan.nextInt();

        if(a>b){
            if(a>c) System.out.println(a + "is largest");
            else //c>=a>=b
              System.out.println(c + " is largest");
        }
        else {//b>=a
            if(b>c) System.out.println(b + " is largest");
            else //c>=b>=a
              System.out.println(c + " is largest");
              
        }

        scan.close();
    }
    
}
