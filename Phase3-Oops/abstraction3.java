abstract class BirdAB{
    public abstract void fly();
    public abstract void eat();
}

class SparrowAB extends BirdAB{
    public void fly(){
        System.out.println("Sparrow flies at low height");
    }
    public void eat(){
        System.out.println("Sparrow eats seeds and insects");
    }
}
abstract class EagleAB extends BirdAB{
    public void fly(){
        System.out.println("Eagle flies at high height");
    }
    public abstract void eat();
   
}

class SerpentEagleAB extends EagleAB{
    public void eat(){
        System.out.println("Serpent Eagle eats snakes and small mammals");
    }
}

class GoldenEagleAB extends EagleAB{
    public void eat(){
        System.out.println("Golden Eagle catches prey over the ocean");
    }
}

class CrowAB extends BirdAB{
    public void fly(){
        System.out.println("Crow flies at medium height");
    }
    public void eat(){
        System.out.println("Crow is an omnivore and eats a variety of food");
    }
}

class SkyAB{
    public void allowBird(BirdAB b){
        b.fly();
        b.eat();
        System.out.println();
    }
}

public class abstraction3 {

    public static void main(String[] args) {
        SkyAB sky = new SkyAB();
        sky.allowBird(new SparrowAB());
        sky.allowBird(new SerpentEagleAB());
        sky.allowBird(new GoldenEagleAB());
        sky.allowBird(new CrowAB());
    }
    
}
