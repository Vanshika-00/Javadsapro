import java.util.Scanner;

public class tableOfN {

    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); 

        for(int i=n; i<=n*10;i+=n){
            System.out.println(i);
        }

        sc.close();
    }


    
}
