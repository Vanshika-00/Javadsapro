import java.util.Scanner;

class CountAPrint{

    void countDigit(int a){

        int count=0;
        int original=a;

        while(a!=0) {
            a=a/10;
            count++;
        }

        System.out.printf("No of digits is %d\n" , count);

        System.out.printf("Square is %d" , original*original);
    }   
}

public class CountAndPrint{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            System.out.print("Please enter the num:");
            int num = sc.nextInt();

        CountAPrint cp = new CountAPrint();
        cp.countDigit(num);

        sc.close();
    }
    
}