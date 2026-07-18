package Strings;
public class modifyCharacterInStrin {
    public static void main(String[] args) {
        String s = "hello";
        // heylo - change 2nd index to y
        s = s.substring(0,2)+ "y"+ s.substring(3);
        System.out.println(s);
    }
    
}
