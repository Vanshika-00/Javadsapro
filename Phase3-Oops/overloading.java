//Overloading - implicit typecasting when we dont give the expected datatypes in parameters of methods

class cal{
    public void add (int a ){
        System.out.println("int argument");
    }

    public void add(float a){
         System.out.println("float argument");

    }
    public void add(double a){
         System.out.println("double argument");

    }
    
}


public class overloading {

    public static void main(String[] args) {
        
        cal c= new cal();
        c.add('9');
        c.add(19L);
        c.add(2.0);
    }
    
}
