package Strings;

public class stringCompression {
    public static void main(String[] args) {
        String s = "aaaabbfhfuhfjjjvvvvv";
        char[] arr= s.toCharArray();
        int i=0;
        int j=0;
        String ans="";

        while(j<arr.length){

            if(arr[j]== arr[i]) j++;
            else {

                ans+=arr[i];
                int len=j-i;
                if(len>1)   ans+=len;
                i=j;

            }
                


        }
                 ans+=arr[i];
                int len=j-i;
                if(len>1)   ans+=len;
                i=j;
                System.out.println(ans);
                System.out.println(ans);
    }
    
}
