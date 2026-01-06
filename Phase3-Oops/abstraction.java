abstract class PlaneAB{
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}

class CargoPlaneAB extends PlaneAB{
    public void takeOff(){
        System.out.println("Cargo Plane is taking off");
    }
    public void fly(){
        System.out.println("Cargo Plane is flying");
    }
    public void land(){
        System.out.println("Cargo Plane is landing");
    }
}

class PassengerPlaneAB extends PlaneAB{
    public void takeOff(){
        System.out.println("Passenger Plane is taking off");
    }
    public void fly(){
        System.out.println("Passenger Plane is flying");
    }
    public void land(){
        System.out.println("Passenger Plane is landing");
    }
}

class FighterPlaneAB extends PlaneAB{
    public void takeOff(){
        System.out.println("Fighter Plane is taking off");
    }
    public void fly(){
        System.out.println("Fighter Plane is flying");
    }
    public void land(){
        System.out.println("Fighter Plane is landing");
    }
}

class Airport{

    public void allowPlane(PlaneAB ref){
        ref.takeOff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}


public class abstraction {
    public static void main(String[] args) {
        
        Airport a = new Airport();
        a.allowPlane(new CargoPlaneAB());
        a.allowPlane(new PassengerPlaneAB());
        a.allowPlane(new FighterPlaneAB());
    }
    
}
