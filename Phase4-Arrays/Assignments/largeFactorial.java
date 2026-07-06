import java.util.ArrayList;


public class largeFactorial {
    
    // This function multiplies x with the number represented by the ArrayList
    public static void multiply(ArrayList<Integer> digits, int x) {
        int carry = 0;

        // Multiply x with every digit stored in the list
        for (int i = 0; i < digits.size(); i++) {
            int product = digits.get(i) * x + carry;
            digits.set(i, product % 10); // Store the last digit of the product
            carry = product / 10;        // Determine the carry
        }

        // If there's any remaining carry left, split it into digits and append it
        while (carry > 0) {
            digits.add(carry % 10);
            carry = carry / 10;
        }
    }

    public static void factorial(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        
        // Initialize the result with 1 (since 0! and 1! are 1)
        digits.add(1);

        // Multiply numbers from 2 up to n
        for (int i = 2; i <= n; i++) {
            multiply(digits, i);
        }

        // Since the array stores digits in reverse order, print from back to front
        System.out.print("Factorial of " + n + " is: ");
        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.print(digits.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5; 
        factorial(n); // Will print a massive 158-digit number perfectly!
    }
}