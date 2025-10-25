class Employee{

    //data security by using private access specifier
    private int eage;
    private int eid;
    private String ename;
    private String eadress;

    //setter methods

    public void setEage(int eage){
        this.eage=eage;
    }
    public void setEid( int eid){
        this.eid=eid;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setEadress(String eadress){
        this.eadress=eadress;
    }

    //getter methods

    public int getEage(){
        return eage;
    }
    public int getEid(){
        return eid;
    }
    public String getEname(){
        return ename;
    }
    public String getEadress(){
        return eadress;
    }


    
}


public class basics2 {

    public static void main(String[]args){

        Employee emp1=new Employee();
        emp1.setEname("Vanshika");
        emp1.setEid(201);
        emp1.setEage(19);
        emp1.setEadress("Jhajjar,Haryana");

        System.out.println("Employee Name:" + emp1.getEname());
        System.out.println("Employee ID:" + emp1.getEid());
        System.out.println("Employee Age:" + emp1.getEage());
        System.out.println("Employee Address:" + emp1.getEadress());



        }
    
}
