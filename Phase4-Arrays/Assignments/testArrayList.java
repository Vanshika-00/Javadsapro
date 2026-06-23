import java.util.Scanner;
import java.util.ArrayList;

public class testArrayList {
    




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        
        int x = sc.nextInt();

        sc.close();

        int res = firOcc(arr, x);
        
        System.out.println(res);
    }

    public static int firOcc(ArrayList<Integer> arr, int x){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x)
                return i;
        }
        return -1;
    }

}