package Conditional;

import java.util.Scanner;

public class rectangleArPr {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length:");
        double l = scan.nextDouble();
        System.out.print("Enter the Breadth:");
        double b = scan.nextDouble();

        double ar= l*b;
        double pr= 2*(l+b);

        if(ar>pr) System.out.println("Area is greater");
        else System.out.println("Parameter is greater");

        scan.close();



    }
    
}
