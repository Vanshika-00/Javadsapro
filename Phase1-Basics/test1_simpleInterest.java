import java.util.Scanner;
public class test1_simpleInterest {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        double principal=scan.nextDouble();

        System.out.println("Enter Rate:");
        double rate=scan.nextDouble();
        
        System.out.println("Enter time(in years):");
        double time=scan.nextDouble();
        
        double simpleInterest= principal*rate*time/100;
        System.out.printf("Simple interest= %.2f", simpleInterest);
        scan.close();
        
    }

    
}
