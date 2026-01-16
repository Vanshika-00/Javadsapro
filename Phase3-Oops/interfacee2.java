interface ICalculator2 {
    void add(int a, int b);
    void subt(int a, int b);
   
}

interface IAdvanedCalculator2{
    void mul(int a, int b);
    void div(int a, int b);

}

class CalculatorImpl2 implements ICalculator2, IAdvanedCalculator2 {
    
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subt(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Division: " + ((double)a / b));
    }
} 

public class interfacee2 {
    public static void main(String[] args) {
       ICalculator2 calc = new CalculatorImpl2();
        calc.add(10, 5);
        calc.subt(10, 5);
        
        IAdvanedCalculator2 advCalc = new CalculatorImpl2();
        advCalc.mul(10, 5);
        advCalc.div(10, 5);
    }
}