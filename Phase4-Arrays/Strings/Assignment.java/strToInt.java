//Q. Input a string of length less than 10 and convert it into integer without using builtin function.
public class strToInt {
    public static void main(String[] args) {
        
       String s = "-1234567";
       System.out.println(convertStr(s));  
    }

    public static int convertStr(String s){
        int startInx=0;
        int n=s.length();
        boolean isNegative=false;
        int num=0;

        //Handles negative no
        if(s.charAt(0)=='-'){
            startInx=1;
            isNegative=true;
        }

        //Convert
        for(int i=startInx;i<n;i++){
            char ch = s.charAt(i);
            int digit=ch - '0';
            num= num*10+digit;

        }

        return isNegative ? -num : num;


        
    }

    
}
