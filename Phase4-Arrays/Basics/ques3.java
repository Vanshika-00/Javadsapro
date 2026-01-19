//Sum of all elements in given Array 

public class ques3 {
    public static void main(String[] args) {
        
        int[] arr={10,10,48,29,04,39,49,59,69,79};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {

            sum=sum+arr[i];
          }

        System.out.println("Sum of all elements in the array is: " + sum);      
    }
    
}
