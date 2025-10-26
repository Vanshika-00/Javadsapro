class Students{
    String name;
    int age;

    Students(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void disp(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

public class instancevar {
    public static void main(String[] args) {
        Students s1=new Students("Sachin",51);
        s1.disp();

        Students s2=new Students("Kohli",37);
        s2.disp();
    }
    
}
