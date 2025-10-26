class plsadd{

    public void add(int a , int b){
        System.out.println("int-int argument");
    }
    public void add(float a , float b){
        System.out.println("float-float argument");
    }
    public void add(double a , double b){
        System.out.println("double-double argument");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        
        plsadd p= new plsadd();
        p.add(10,20);
        p.add(4.4f,5.5f);
        p.add(2.0,2.0);
    }
    
}
