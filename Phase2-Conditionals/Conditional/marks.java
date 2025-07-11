package Conditional;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Marks:");
        int num=scan.nextInt();

        if (num>=81) System.out.println("Very Good");
        else if (num>=61) System.out.println("Good");
        else if (num>=41) System.out.println("Average");
        else System.out.println("Fail");

        scan.close();
    }
    
}
