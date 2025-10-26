class calc{
    public void add (int a , int b){
        int result=a+b;
        System.out.println("Result is : "+result);
    }
}


public class localvar {
    public static void main (String [] arg ){
        calc c1=new calc();
        c1.add(5,4);
    }
    
}
