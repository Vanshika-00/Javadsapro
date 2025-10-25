class Student{
    private int rollNo;
    private String name;
    private String adress;

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;     
    }
    public void setName(String name){
        this.name=name;

    }
    public void setAdress(String adress){
        this.adress=adress;
    }

    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
}

public class basics{
    public static void main(String[]args){

        Student student1=new Student();
        student1.setRollNo(10);
        student1.setName("Sachin");
        student1.setAdress("MI Road,Haryana");

        System.out.println("Student Roll No: " + student1.getRollNo());
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAdress());
        


    }

}