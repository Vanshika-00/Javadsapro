package Strings;
import java.util.Scanner;

public class inputString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name:");

        String str = sc.next(); // 

        System.out.print("Hi " + str + "!");

        sc.close();

    }
    
}
