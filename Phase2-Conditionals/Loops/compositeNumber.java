import java.util.Scanner;

public class compositeNumber {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int x=0; //prime no
        for(int i=2;i<=n-1; i++ ){
            if(n%i==0) { 
            System.out.println("Composite Number");
            x=1; //1 means composite
            break;}
        }

        if (x==0) System.out.println("Prime Number");

        sc.close();
    }
    
}
