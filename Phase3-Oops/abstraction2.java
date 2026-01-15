abstract class PersonAB{
    String name;
    int age;
    float height;

    PersonAB(String name,int age,float height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

}
class StudentAB extends PersonAB{

    int marks;
    float avg;

    StudentAB(String name,int age,float height,int marks,float avg){
        super(name,age,height);
        this.marks=marks;
        this.avg=avg;
    }

    public void displayStudentDetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Height: "+height);
        System.out.println("Student Marks: "+marks);
        System.out.println("Student Average: "+avg);
    }


}


public class abstraction2 {
    public static void main(String[] args) {
        StudentAB student = new StudentAB("Vanshika",20,5.6f,1170,90.0f);
        student.displayStudentDetails();
    }
    
}
