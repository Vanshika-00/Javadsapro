package Conditional;

import java.util.Scanner;

public class validTriangle {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first side :");
        int a=scan.nextInt();
        System.out.print("Enter second side :");
        int b=scan.nextInt();
        System.out.print("Enter third side :");
        int c=scan.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");
        scan.close();
    }
    
}
