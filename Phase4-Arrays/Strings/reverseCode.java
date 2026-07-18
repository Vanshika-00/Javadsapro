package Strings;

import java.util.Scanner;

public class reverseCode {

    public static void main(String[] args) {
        
    

     Scanner sc = new Scanner(System.in);

    StringBuilder sb = new StringBuilder(sc.nextLine());

    int i=0,j=sb.length()-1;

    while(i<j){
        char ch = sb.charAt(i);
        char dh =sb.charAt(j);

        
        sb.setCharAt(i, dh);
        sb.setCharAt(j, ch);

        i++; j--; 

    }

    sc.close();

    System.out.println(sb);
    
}
}
