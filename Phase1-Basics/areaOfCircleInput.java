import java.util.Scanner;
public class areaOfCircleInput {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.printf("Enter radius:");
        double r=sc.nextDouble();
        double a=3.141592*r*r;
        System.out.println("Area is: " + a);

        sc.close();


    }
    
}
