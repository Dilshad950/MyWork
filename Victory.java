import java.util.*;
public class Victory {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean victory;
        int i = 0;
        while (true) {
            if (game.length == 0) {
                victory = false;
                break;
            }
            if (leap > game.length) {
                victory = false;
                break;
            }

            if (game[i + 1] == 0 && (i + leap) != game.length - 1) {
                i++;
                if (i == game.length) {
                    victory = true;
                    break;
                }
                continue;
            }
            if (game[i + 1] == 0 && (i + leap) == game.length - 1) {
                i = game.length - 1;
                victory = true;
                break;
            }
            if (game[i + 1] != 0 && (i + leap) == game.length - 1) {
                i = game.length - 1;
                victory = true;
                break;
            }
            if (game[i + 1] != 0 && (i + leap) <= game.length - 1 && game[i + leap] == 0) {
                i = i + leap;
                if (i == game.length - 1) {
                    victory = true;
                    break;
                } else if (i != game.length - 1) {
                    victory = false;
                    break;
                }

                if (game[i + 1] != 0 && (i + leap) <= game.length - 1 && game[i + leap] != 0) {
                    victory = false;
                    break;
                }
            }
            return victory;
        }

        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                }

                System.out.println((canWin(leap, game)) ? "YES" : "NO");
            }
            scan.close();
        }
    }
}

