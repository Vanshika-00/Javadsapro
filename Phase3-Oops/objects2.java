class Samples{
    public void methodOne(String s ){
        System.out.println("String version...");
    }
    public void methodOne(Object o ){
        System.out.println("Object version...");      
    }
    public void methodOne(StringBuffer sb){
        System.out.println("StringBuffer version...");
    }
}

public class objects2 {

    public static void main(String[] args) {
        Samples s= new Samples();
        s.methodOne(new String("sachin"));
        s.methodOne(new StringBuffer("sachin"));
        //s.methodOne(null);
        
    }
    
}
