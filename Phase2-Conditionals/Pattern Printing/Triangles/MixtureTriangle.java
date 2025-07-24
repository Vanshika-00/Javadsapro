import java.util.Scanner;

public class MixtureTriangle {
      public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter n: ");
        
        int n=sc.nextInt();


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

               if(i%2==0) System.out.printf ((char)(j+64)+ " ");
               else System.out.printf (j+ " ");
            }

            System.out.println();
        }
        sc.close();

    }

    
}
