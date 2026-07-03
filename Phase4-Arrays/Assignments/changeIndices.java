
/* Q Given an array of integers, change the value of all odd indexed elements to its second multiple and
increment all even indexed values by 10.*/

public class changeIndices {

    public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };

    for(int i =0;i<arr.length;i++){
        if(i%2==0){
            arr[i]= arr[i]+10;
        }
        else{
            arr[i]= arr[i] *2;
        }
    }

    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    
}
}
