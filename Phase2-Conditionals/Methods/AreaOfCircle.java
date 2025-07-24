import java.util.Scanner;

class Circle{
    double calculateArea(double radius){

        return 3.14*radius*radius;
    }
}

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            System.out.print("Please enter the radius:");
            double r = sc.nextDouble();

        Circle cs = new Circle();
        double result=cs.calculateArea(r);
        System.out.printf("Area is: %.2f\n " , result);

        sc.close();
    }
}