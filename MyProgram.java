import java.util.Scanner;

public class MyProgram {
    public static void main (String [] args){
        int rows = 5, k ;
        int input;
        while(true) {
            System.out.println("Select Pattern. 1) Triangle 2)Inverse Triangle");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            if (input == 1) {


                for (int i = 1; i <= rows; i++) {
                    k = 0;
                    for (int space = 1; space <= rows - i; space++) {
                        System.out.print("  ");
                    }

                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        k++;
                    }
                    System.out.println();
                }

            } else {
                for (int i = rows; i >= 1; i--) {
                    k = 0;
                    for (int space = rows - i; space >= 1; space--) {
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        k++;
                    }

                    System.out.println();
                }
            }
        }
    }
}
