public class palindrome {
    public static void main(String[] args) {
        String s = "1212";

        int i=0;
        int j=s.length()-1;
        boolean isPalindrome = true;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
               
                isPalindrome = false; 
                break;
                
            }
            i++;j--;

        }
        if (isPalindrome) System.out.println("Is A Palindrome!");
        else System.out.println("Not A Palindrome!");
    }
}
