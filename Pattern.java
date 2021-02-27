import java.util.Scanner;

public class Pattern {

    public static void main (String [] args ){

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = 0;
        int  a = A.length();
        int b= B.length();
        boolean isTrue = false;
        sum = a+b;
        System.out.println(sum);
        for(int i = 0 ;i<Math.min(a,b); i++){
            if(B.charAt(i)<A.charAt(i)){
                isTrue = true;
                break;
            }
            else if(B.charAt(i)==A.charAt(i)){
                continue;
            }
            else{
                isTrue = false;
            }
        }
        if(isTrue==true){
            System.out.println("Yes");

        }
        else
            System.out.println("No");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        double d = scan.nextDouble();

        String s = scan.nextLine();
s.t

 int x = Math.min()
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        System.out.println(s);
        int k;
//        pattern 1
        for ( int i = 1 ; i <=n; i++){
            for(int j= 1; j<=n-i;j++){
                System.out.print("  ");
            }
            if (i ==1 || i==n){
            for (int j = 1 ; j<=i; j++){
                System.out.print("* ");}
            } else {
                System.out.print("* ");
                for (int j = 1; j <= i-2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");
//         pattern 2
        for (int space = 1; space <= n ; space++) {
            System.out.print("  ");
        }
        System.out.println("1 ");
        for (int i = 1; i <= n; i++) {
            k = 0;

            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            System.out.print(i+ " ");
            while (k !=  2*i - 1) {

                System.out.print("0 ");
                k++;
            }
            System.out.print("1 ");
            System.out.print(i+ " ");
            System.out.println();
        }

    }
}
