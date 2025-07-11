package Conditional;

import java.util.Scanner;

public class fiveOrThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=scan.nextInt();

        if(n%5==0 || n%3==0) System.out.println("Divisible by 5 or 3");
        else System.out.println("Not Divisible by 5 or 3");

        scan.close();
    }
    

}
