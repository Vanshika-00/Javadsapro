class DemoQ3{
    void disp(int x){
        System.out.println("int-arg method");
    }
    void add(float y){
        System.out.println("float-arg method");
    }
}

public class overloading_ques3 {
    public static void main(String[] args) {
        DemoQ3 d= new DemoQ3();
        d.disp(10);
        d.disp('A');
        d.add(10.5f);
        d.add(100L);

        // d.disp(10.5f); -- error
        // d.disp(100L); -- error
        // d.disp(100.5); -- double to int not possible
        // d.disp(true); -- boolean to int not possible
        
    }
    
}
