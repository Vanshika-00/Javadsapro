public class concatReverse {
    public static void main(String[] args) {
        
        String s = "apple";

        System.out.println(reverse(s));
    }

    public static String reverse (String s){

        

        char [] arr=s.toCharArray();

        int i=0;
        int j = arr.length-1;

        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }

        String reversed = new String(arr);

        String conc = s+reversed;

        return conc;
        

        }


    }
    

