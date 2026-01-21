import java.util.Scanner;
public class test1pw
{
public static void main( String[] args)

{
Scanner sc= new Scanner(System.in);

int n= sc.nextInt();
int[] arr = new int[n];

for(int i=0; i<n;i++){
 arr[i] = sc.nextInt();

}

int target=sc.nextInt();

int result = linearSearch(arr , target);

if(result ==-1)
System.out.println("-1");
else
System.out.println(result);


sc.close();

}

public static int linearSearch(int[] arr , int target){
for(int i=0; i<arr.length ;i++) {
if(arr[i] == target)
return i;

}

return -1; 



}



}

