interface IDemo{
    int x=10;
}


public class interfacee4 implements IDemo{
    public static void main(String[] args) {
        int x=100; // local variable
        System.out.println(x);
        System.out.println(IDemo.x);
        System.out.println(interfacee4.x);
    }
    
}
