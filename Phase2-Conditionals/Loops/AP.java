import java.util.Scanner;

public class AP{

    public static void main(String[] args) {
        
    //4,7,10,13,16....

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the no of terms:");
    int n=sc.nextInt();

    // for(int i=1;i<=2*n-1;i+=2){
    //     System.out.println(i);
    // }

    int a=4 , d=3;
    for(int i=1;i<=n;i++){
        System.out.println(a);
        a+=d;
    }


sc.close();

}
}