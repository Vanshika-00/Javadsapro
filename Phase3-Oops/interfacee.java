interface ICalculator {
    void add(int a, int b);
    void subt(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}

class ICalculatorImpl implements ICalculator {
    
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

public class interfacee {
    public static void main(String[] args) {
        ICalculator calc = new ICalculatorImpl();
        calc.add(10, 5);
        calc.subt(10, 5);
        calc.mul(10, 5);
        calc.div(10, 5);
    }
}
