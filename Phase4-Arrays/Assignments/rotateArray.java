public class rotateArray {

    public static void main(String[] args){
        int[] arr= {10,20,30,40,50,60,70};
        int n = arr.length;
        int k=5;
        k=k%n;

        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        

        int[] rotated = new int [n];

        for(int i=0;i<n;i++){ 
            rotated[(i+k)%n]=arr[i];
        }
        

        for (int ele :rotated){
            System.out.print(ele+" ");
        }
        }
    }
    

