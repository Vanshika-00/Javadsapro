package Conditional;

import java.util.Scanner;

public class triangleType {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first side :");
        int a=scan.nextInt();
        System.out.print("Enter second side :");
        int b=scan.nextInt();
        System.out.print("Enter third side :");
        int c=scan.nextInt();


        if(a+b>c && b+c>a && a+c>b ){
            if(a==b&&b==c) System.out.println("Equilateral Triangle");
            else if(a==b || b==c|| c==a) System.out.println("Isosceles Triangle ");
            else System.out.println("Scalene Triangle");

        }
        else System.out.println("Not a valid triangle");

        scan.close();
        
    }
    
}
