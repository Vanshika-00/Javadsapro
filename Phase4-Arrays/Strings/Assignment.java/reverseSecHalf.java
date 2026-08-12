//Q4 Input a string of even length and reverse the second half of the string.
public class reverseSecHalf {
    public static void main(String[] args) {
        String s= "cucumber";
        System.out.println(reverse(s));


    }

    public static String reverse(String s){

        StringBuilder sb = new StringBuilder(s);

        int n=sb.length();
        int i=n/2;
        int j=n-1;

        while(i<j){

            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);

            i++;j--;

        }

        return sb.toString();
    }
    
}
