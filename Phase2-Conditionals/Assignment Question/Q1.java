import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter n:");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
