public class secLargest {
    public static void main(String[] args) {
        String s = "29892898";
        System.out.println(secLargest(s));
    }

    public static int secLargest(String s){


        int lar=-1;
        int secLar=-1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                int digit = ch -'0';
                  if(digit>lar){

                    secLar=lar;
                    lar=digit;
                
            }
            else if (digit<lar && digit>secLar){
                secLar=digit;
            }
            }

          
        }
        return secLar;
    }
    
}
