public class Anagram {
    public static void main(String[] args) {
        String a = "aabe";
        String b = "abad";
        boolean isAnagram = false;
        boolean visited [] = new boolean[b.length()];

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                isAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == a.charAt(i) && !visited[j]) {
                        isAnagram = true;
                        visited[j]= true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if (isAnagram) {
             System.out.println("Anagram");
        } else
        System.out.println(visited.length);
            System.out.println("Not Anagram");
    }
}
