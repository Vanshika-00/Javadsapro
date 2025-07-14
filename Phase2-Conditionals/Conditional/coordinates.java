package Conditional;

import java.util.Scanner;

public class coordinates{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the x-coordinate:");
        int x=scan.nextInt();

        System.out.print("Enter the y-corrdinate:");
        int y=scan.nextInt();

        if(x==0 && y==0) System.out.println("This point lies on Origin");
        else if( y==0) System.out.println("This point lies on x-axis");
        else if(x==0) System.out.println("This point lies on y-axis ");
        else if(x>0 && y>0) System.out.println("This point lies on First Quadrant");
        else if(x<0 && y>0) System.out.println("This point lies on Second Quadrant");
        else if(x<0 && y<0) System.out.println("This point lies on Third Quadrant");
        else  System.out.println("This point lies on Fourth Quadrant");

        scan.close();
      
}
}