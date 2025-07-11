import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a char: ");
        char ch= sc.next().charAt(0);

        int x= (int)ch; //typecasting to int 
        System.out.println(x);

        sc.close();
    }
    
}
