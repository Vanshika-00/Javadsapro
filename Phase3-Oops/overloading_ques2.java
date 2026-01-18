class DemoQ2{
    void disp(int x , float y){
        System.out.println("Cool");
    }
    void disp(int x , double y){
        System.out.println("Fool");
    }

}


public class overloading_ques2 {
    public static void main(String[] args) {
        DemoQ2 d = new DemoQ2();
        int a =10;
        long b =100L;
        d.disp(a, b);

    }
    
}
