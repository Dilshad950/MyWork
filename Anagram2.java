public class Anagram2 {
    public static void main ( String [] args ){

        String a = "abc:defghijklmn";
        String b = "acbjlknmfdehig";
        boolean isAnagram = true;
        int[] ab = new int[256];

        for(char c : a.toCharArray() ){
            int index = (int)c;
            ab[index]++;
        }
        for(char c : b.toCharArray() ){
            int index = (int)c;
            ab[index]--;
        }
        for(int i = 0 ; i< 256 ; i++){
            if(ab[i]!=0){
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else
            System.out.println("Not Anagram");
    }
}
