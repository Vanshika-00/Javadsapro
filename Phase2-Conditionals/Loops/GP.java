import java.util.Scanner;

public class GP {

    public static void main(String[] args) {
        
           Scanner sc= new Scanner(System.in);
    System.out.print("Enter the no of terms:");
    int n=sc.nextInt();
    //1,2,4,8,16,32.....
    int a =1;
    for (int i=1;i<=n;i++){
        System.out.println(a);
        a*=2;
    }

    sc.close();
    }
    
}
