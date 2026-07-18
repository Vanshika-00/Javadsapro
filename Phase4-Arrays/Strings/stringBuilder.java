package Strings;

public class stringBuilder {
    public static void main(String[] args) {
        
        StringBuilder a = new StringBuilder();
        System.out.println(a.capacity());

        String s = "abc";
        StringBuilder b = new StringBuilder(s);
        System.out.println(b);
        System.out.println(b.capacity());
        
    }
    
}
