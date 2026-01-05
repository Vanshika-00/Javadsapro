class AnimalOR2{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class MonkeyOR2 extends AnimalOR2{
    public void eat(){
        System.out.println("Monkey steals and eats");
    }
    public void sleep(){
        System.out.println("Monkey sleeps on tree");
    }

}

class DeerOR2 extends AnimalOR2{
    public void eat(){
        System.out.println("Deer grazes and eats");
    }
    public void sleep(){
        System.out.println("Deer sleeps in the forest");
    }
}

class LionOR2 extends AnimalOR2{
    public void eat(){
        System.out.println("Lion hunts and eats");
    }
    public void sleep(){
        System.out.println("Lion sleeps in the den");
    }
}

class ForestOR2{
    public void allowAnimal(AnimalOR2 a){
        a.eat();
        a.sleep();
        System.out.println();
    }
}


public class overriding3 {

    public static void main(String[] args) {
          
            ForestOR2 f = new ForestOR2();
            f.allowAnimal(new MonkeyOR2());
            f.allowAnimal(new DeerOR2());
            f.allowAnimal(new LionOR2());
        
    }


}
