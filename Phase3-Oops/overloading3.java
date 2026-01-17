//Zabii sirrrr eg:

class Calculator3{
    // Overloaded methods with 2 parameters
    int add(int x, int y) { return x + y; }
    
    float add(int x, float y) { return x + y; }
    
    float add(float x, float y) { return x + y; }
    
    float add(float x, int y) { return x + y; }
    
    double add(double x, double y) { return x + y; }
    
    double add(int x, double y) { return x + y; }
    
    double add(float x, double y) { return x + y; }

    // Overloaded methods with 3 parameters
    int add(int x, int y, int z) { return x + y + z; }
    
    float add(float x, float y, float z) { return x + y + z; }
    
    double add(double x, double y, double z) { return x + y + z; }
    
    double add(int x, float y, double z) { return x + y + z; }

    // Overloaded method with 4 parameters
    double add(int w, float x, float y, double z) { return w + x + y + z; }
}

public class overloading3{
    public static void main(String[] args) {
        // Variable declarations
        int a = 10, b = 20, c = 30;
        float p = 10.5f, q = 20.5f, r = 30.5f;
        double x = 100.5, y = 200.5, z = 300.5;

        // Object creation
        Calculator3 calc = new Calculator3();

        // Calling various overloaded methods
        System.out.println(calc.add(a, p, q, x));
        System.out.println(calc.add(a, b, c));    
        System.out.println(calc.add(x, y));       
        System.out.println(calc.add(a, p));       
        System.out.println(calc.add(r , z));       
    }
}