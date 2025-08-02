import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) { //Q 12 
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter n:");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ //spaces
                System.out.print(" " +" ");
            }
            for(int j=1;j<=i;j++){
                System.out.printf(j + " ");
            }
            for(int j=i+1;j<=2*i-1;j++){
                System.out.printf(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
