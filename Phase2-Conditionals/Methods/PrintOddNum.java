import java.util.Scanner;

class PrintNum{
    void printOdd(int a , int b){


        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=a;i<=b;i++){
            if(i%2!=0) System.out.println(i);
        }
    }
}



public class PrintOddNum {

    public static void main(String[] args) {

         Scanner sc= new Scanner(System.in);
            System.out.print("Please enter first num:");
            int num1 = sc.nextInt();

            System.out.print("Please enter second num:");
            int num2 = sc.nextInt();


        PrintNum pn = new PrintNum();
        pn.printOdd(num1, num2);
        sc.close();
        
    }
    
}
