import java.util.Scanner;

public class palindromeString {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); 

        int len=str.length();
        str=str.toLowerCase();
        boolean isPalindrome=true;

        for(int i=0; i<=len/2;i++){

            if(str.charAt(i)!= str.charAt(len-i-1)){
            isPalindrome=false;
            break;}


        }

        if (isPalindrome) System.out.println("Yes, it's a palindrome.");
        else System.out.println("Nope, not a palindrome.");
        sc.close();

        
    }
    
}
