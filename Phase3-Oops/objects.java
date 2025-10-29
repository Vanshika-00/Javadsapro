
//objects in java
class Sample{
    public void methodOne(String s ){
        System.out.println("String version...");
    }
    public void methodOne(Object o ){
        System.out.println("Object version...");
    }
}

public class objects {
    public static void main(String[] args) {
        Sample obj= new Sample();
        obj.methodOne("sachin");
        obj.methodOne(new Object());
        obj.methodOne(null); // it will call String version because String is more specific

    }
    
}
