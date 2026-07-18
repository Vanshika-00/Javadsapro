package Strings;
import java.util.Scanner;
public class evenPosToZero {

    public static void main(String[] args) {
        System.out.println("Pls enter a string:");

        Scanner sc = new Scanner(System.in);

        String str="";
        
        String s=sc.nextLine();

        for(int i =0;i<s.length();i++){
            
            if(i%2==0) str+='a';

            else {
                str+=s.charAt(i);
            }

        }

        System.out.println(str);

          
        sc.close();
    }
    
}
