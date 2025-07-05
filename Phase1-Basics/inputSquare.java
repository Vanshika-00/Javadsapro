import java.util.Scanner;
public class inputSquare {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number:");
        int n=sc.nextInt();

        n=n*n;
        System.out.println("The square is: " + n );
        
    }
    
}
