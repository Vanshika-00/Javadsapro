class ParentOR{
    public void property(){
        System.out.println("Land , Cash , Gold");
    }
    public void marry(){
        System.out.println("Relative girl");
    }
}

class ChildOR extends ParentOR{
    public void marry(){
        System.out.println("Some other girl");
    }
}


public class overriding {

    public static void main(String[] args) {
        
        ParentOR p1=new ParentOR();
        p1.property();
        p1.marry();

        System.out.println();

        ChildOR c1=new ChildOR();
        c1.property();
        c1.marry();

        System.out.println();

        ParentOR p2=new ChildOR();
        p2.property();
        p2.marry();

    }
    
}
