import java.util.Scanner;

public class StarTriangleFlippedVert {
    
public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = sc.nextInt();

        
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n)
                System.out.print( "*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
   
}
