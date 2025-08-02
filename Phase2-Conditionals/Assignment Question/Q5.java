import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter n:");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+2;j++){

               if((i==2 ||i==3) && j>2 ) continue;
              
                System.out.print("*" +" ");
            }
            
            System.out.println();
        }

        sc.close();
    }
    
}
