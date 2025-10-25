class Person {
    public String name;
    public String address;
    public int age;
}

class Student extends Person {
    public int marks;
    public String grade;

    Student(String name, String address, int age, int marks, String grade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student st = new Student("Sachin", "Mumbai", 21, 95, "A+");
        st.disp();
    }
}
