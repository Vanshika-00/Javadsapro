package Strings;

import java.util.Scanner;

public class reverseQues {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
           StringBuilder sb = new StringBuilder(sc.nextLine());

        
        int n = sb.length();
        int i=0;

        for (int j=0;j<=n;j++){
            if(j==n || sb.charAt(j)==' '){

                reverse(sb,i,j-1);
                 i=j+1;
           

            }


                
            
        }
        sc.close();
        System.out.println(sb);
           
        }
        
    
    
    public static void reverse(StringBuilder sb, int i , int j){

        while(i<j){

        
        //char ch = sb.charAt(i);
        //char dh =sb.charAt(j);

        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j) );
        sb.setCharAt(j, temp);

        i++; j--; 

    }

    }
}
