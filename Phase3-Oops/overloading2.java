class calculator{
    public void add (int a , float b ){
        System.out.println("int-float argument");
    }
    public void add(float a , int b ){
        System.out.println("float-int argument");
    }
}


public class overloading2 {
    public static void main(String[] args) {
        
        calculator c= new calculator();
        c.add(10,4.5f);
        c.add(4.5f,10);
        
    }
    
}
