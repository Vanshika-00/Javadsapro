package Strings;
import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        String s = "vanshika";
        char ch[] = s.toCharArray();
        Arrays.sort(ch);

        for(char ele :ch){
            System.out.print(ele);
        }
        System.err.println();
        StringBuilder sb = new StringBuilder("mehra");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);


         for(char ele :arr){
            System.out.print(ele);
        }
    
} }

