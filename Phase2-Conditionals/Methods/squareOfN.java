import java.util.Scanner;
class Square{

    

    void printsquare (int n ){

        for(int i=1;i<=n;i++){
            int square=i*i;
            System.out.println(square);
        }
        
    }

    public class squareOfN{
        
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.print("Please enter the num:");
            int num = sc.nextInt();

            Square sq= new Square();
            sq.printsquare(num);
            sc.close();

            
          
        } 

    
    }





}