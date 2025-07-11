package Conditional;

import java.util.Scanner;

public class profitLoss {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a cost Price:");
        int cp=scan.nextInt();
        System.out.print("Enter a selling Price:");
        int sp=scan.nextInt();

        if(cp<sp) System.out.println("Profit is " + (sp-cp));
        if(cp>sp) System.out.println("Loss is " + (cp-sp));
        if(cp==sp)System.out.println("No Profit no Loss");

        scan.close();


    }
    
}
