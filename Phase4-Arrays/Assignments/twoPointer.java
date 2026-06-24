public class twoPointer {
    

    public static void main(String args[]){

        int[] arr = {60,50,40,30,20,10,};

    int n = arr.length;

    for (int ele : arr){
        System.out.print(ele + " ");
    }

    System.out.println();
    
    int i=0;int j=n-1;
    while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }

    for (int ele :arr){
        System.out.print(ele + " ");
    }
    }
}
