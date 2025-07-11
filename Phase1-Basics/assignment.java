import java.util.Scanner;
public class assignment {

public static void main(String[] args) {

    //Q1. Write a Java program that declares an integer variable, initializes it with a value, prints the value,
    //updates the value, and prints the updated value.
    int a=9;
    System.out.println(a);
    a=10;
    System.out.println(a);


//Q2.Write a Java program that demonstrates the use of increment (++), decrement (--), and modulus (%)
//operators. Print the results.

   int b=10;
   int c=5;
   System.out.println(++b);//11
   System.out.println(--b);//10
   System.out.println(b%c);

Scanner scan= new Scanner(System.in);
System.out.println("Enter first no: ");
int d=scan.nextInt();
System.out.println("Enter second no: ");
int e=scan.nextInt();

boolean isEqual= (d==e);
boolean notEqual= (d!=e);
boolean isGreater= (d>e);
boolean isLess= (d<e);

if (isEqual){
    System.out.println(d  +  "is equal to" +  e);
}
if (notEqual){
    System.out.println(d  +  " is not equal to " +  e);
}
if (isGreater){
    System.out.println(d   +  " is greater then " +  e);
}
if (isLess){
    System.out.println(d  +  " is less then " +  e);
}

scan.close();

    
}

}
