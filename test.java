//import java.util.Arrays;
//
//public class test {
//    public static void main ( String [] args){
////        String s = "{{{[]))(}}{}}(";
////          char [] sorted = new char[s.length()];
////            sorted = s.toCharArray();
////            Arrays.sort(sorted);
////        for(char c: sorted){
////            System.out.print(c + " ");
////        }
//        Arrays.s
//    }
//}
import java.util.*;

// Write your Checker class here
class Checker implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;
        if(p1.score<p2.score){
            return 1;
        }
       else  if(p1.score>p2.score){
            return -1;
        }
       else if (p1.score == p2.score){
           for(int i=0 ; i < Math.min(p1.name.length(),p2.name.length());i++){
               if(p1.name.charAt(i)>p2.name.charAt(i)){
                   return 1;
               }
               else if(p1.name.charAt(i)<p2.name.charAt(i)){
                   return -1;
               }

               else if (p1.name.charAt(i)==p2.name.charAt(i) && p1.name.length()==1){
                   return -1;}
               else if (p1.name.charAt(i)==p2.name.charAt(i) && p2.name.length()==1){
                   return 1;}
               else if (p1.name.charAt(i)==p2.name.charAt(i)){
                   continue;
               }
           }
        }
        return 0;
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
