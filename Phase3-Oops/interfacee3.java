interface ICalculator3 {
    void add(int a, int b);
    void subt(int a, int b);
   
}

class CalculatorAdvanced3{
    void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void div(int a, int b) {
        System.out.println("Division: " + ((double)a / b));
    }
}

class CalculatorImpl3 extends CalculatorAdvanced3 implements ICalculator3 {
    
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subt(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}


public class interfacee3 {

    public static void main(String[] args) {

        CalculatorImpl3 calc = new CalculatorImpl3();
        calc.add(10, 5);
        calc.subt(10, 5);
        calc.mul(10, 5);
        calc.div(10, 5);
    }
    
}
