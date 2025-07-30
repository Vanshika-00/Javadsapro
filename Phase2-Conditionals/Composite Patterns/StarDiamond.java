import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = sc.nextInt();

       

         int nsp=n-1;
         int nst=1;

        for(int i =1;i<=n;i++){ //rows
            
            for(int j=1;j<=nsp;j++){ //spacs
                System.out.print( " " + " ");
            }
            for(int j=1;j<=nst;j++){ //stars
                System.out.print( "*" + " ");
            
            }

            nsp--;
            nst+=2;
           
            System.out.println();
        
        }

        //lower pyramid

         nsp=1;
         nst-=4;

         for(int i =1;i<=n;i++){ //rows
            
            for(int j=1;j<=nsp;j++){ //spacs
                System.out.print( " " + " ");
            }
            for(int j=1;j<=nst;j++){ //stars
                System.out.print( "*" + " ");
            
            }

            nsp++;
            nst-=2;
           
            System.out.println();
        
        }
        sc.close();  
    
    
}
 
    
}
