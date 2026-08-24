public  class vowelSubstr{

    public static int countSubstr(String s){

        int count=0;
        int streak=0;

        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            
            if(isVowel(ch)){
                streak++;
                count+=streak;
            }
            else {
                streak=0;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }

    public static void main(String[] args) {

        String s = "abae";
        System.out.println(countSubstr(s));
        
    }
    
}
