import java.sql.SQLOutput;

public class ReverseString {

    static String reverseString(String s){
    int i = s.length()-1;
    String ans ="";
    while(i>=0){

        while(i>=0 && s.charAt(i)== ' ' )
            i--;
        int j = i;

        while( i>= 0 && s.charAt(i) != ' ' )
            i--;
        if(ans.isEmpty() ){
            ans = ans.concat(s.substring(i+1,j+1) );
        }else
            ans = ans.concat(" " + s.substring(i+1,j+1) );
        }
    return ans;
    }
    public static void main (String[] args){
        String test = "            My name is  afk  e   fk       Dilshad        ";
        System.out.println(test);
        System.out.print(reverseString(test));
        System.out.print("yoyo");
    }
}
