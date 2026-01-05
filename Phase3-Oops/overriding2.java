// Example of method overriding with different types of planes

class PlaneOR{
    void takeoff(){
        System.out.println("Plane is taking off");
    }
    void fly(){
        System.out.println("Plane is flying");
    }
    void land(){
        System.out.println("Plane is landing");
    }
}

class PassangerPlaneOR extends PlaneOR{
     void takeoff(){
        System.out.println("Passanger-plane is taking off");
    }
    void fly(){
        System.out.println("Passanger-Plane is flying");
    }
    void land(){
        System.out.println("Passanger-Plane is landing");
    }
    
}

class CargoPlaneOR extends PlaneOR{
     void takeoff(){
        System.out.println("Cargo-plane is taking off");
    }
    void fly(){
        System.out.println("Cargo-Plane is flying");
    }
    void land(){
        System.out.println("Cargo-Plane is landing");
    }
    
}

class FighterPlaneOR extends PlaneOR{
     void takeoff(){
        System.out.println("Fighter-plane is taking off");
    }
    void fly(){
        System.out.println("Fighter-Plane is flying");
    }
    void land(){
        System.out.println("Fighter-Plane is landing");
    }
    
}

class AirportOR{
    public void allowPlane(PlaneOR p){
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}


public class overriding2 {

    public static void main(String[] args) {
        
        PassangerPlaneOR p=new PassangerPlaneOR();
        CargoPlaneOR c= new CargoPlaneOR();
        FighterPlaneOR f= new FighterPlaneOR();

        AirportOR a=new AirportOR();
        a.allowPlane(p);
        a.allowPlane(c);
        a.allowPlane(f);



    }
    
}
