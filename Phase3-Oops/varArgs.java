class CalculatorVA{
    public void add(int ... args){
        int sum=0;
        for(int data: args){
            sum += data;
        }
        System.out.println("Sum is: " + sum);
    }

}

public class varArgs{
    public static void main(String[] args) {
        CalculatorVA c= new CalculatorVA();
       c.add();
       c.add(10);
       c.add(10,20);
       c.add(10,20,30);
       c.add(10,20,30,40);
       c.add(10,20,30,40,50);
    
    }
    
}
