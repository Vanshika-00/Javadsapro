package Strings;

public class append {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Abc");
        sb.append(35);
        System.out.println(sb);
         sb.append('*');
         System.out.println(sb);
         char[] ch ={'v','a','n'};
         sb.append(ch);
         System.out.println(sb);
    }
    
}
