//Q1. Will the following program compile? If not, why?
//Return type don't have any significance in method overloading.

class CalQ{
    int add(int x , int y) 
    {
        return 30;
    }

    float add(int x , int y){
        return 30.5f;
    }
}


public class overloading_ques1 {

    public static void main(String[] args) {
        CalQ c= new CalQ();
        System.out.println(c.add(10,20));
    }
    
}
