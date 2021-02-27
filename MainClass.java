//import java.util.Scanner;
//import java.util.Stack;
//
//public class MainClass {
////    public static boolean isBal(String s){
////        boolean isBalanced = true;
////        Stack<Character> stack = new Stack<>();
////        if (s.length() % 2 != 0) {
////            isBalanced = false;
////        }
////        for (int i = 0; i < s.length(); i++) {
////            char ch = s.charAt(i);
////            if (ch == '(' || ch == '{' || ch == '[') {
////                stack.push(ch);
////                continue;
////            }
////            if (stack.empty()) {
////                isBalanced = false;
////                break;
////            }
////            if (ch == ')') {
////                if (stack.peek() == '(') {
////                    stack.pop();
////                } else isBalanced = false;
////            }
////            if (ch == '}') {
////                if (stack.peek() == '{') {
////                    stack.pop();
////                } else isBalanced = false;
////            }
////            if (ch == ']') {
////                if (stack.peek() == '[') {
////                    stack.pop();
////                } else isBalanced = false;
////            }
////        }
////        if(stack.empty()){
////            isBalanced = true;
////        }
////        return isBalanced;
////    }
////
////
////
////    public static void main(String [] args){
////        Scanner sc = new Scanner(System.in);
////        String s = sc.nextLine();
////        if (isBal(s) ==true) {
////            System.out.println("Balanced");
////        } else
////            System.out.println("Not Balanced");
////
////    }
////}
//public static boolean isBal (String s){
//    boolean isBalanced  = true;
//    if (s.length() % 2 != 0) {
//        isBalanced = false;
//    }
//    if(s.length()==0){
//        isBalanced = false;
//    }
//    Stack<Character> stack = new Stack<>();
//    for (int i = 0; i < s.length(); i++) {
//        char ch = s.charAt(i);
//        if (ch == '(' || ch == '{' || ch == '[') {
//            stack.push(ch);
//            continue;
//        }
//        if (stack.empty()) {
//            isBalanced = false;
//            break;
//        }
//        if (ch == ')') {
//            if (stack.peek() == '(') {
//                stack.pop();
//            } else isBalanced = false;
//        }
//        if (ch == '}') {
//            if (stack.peek() == '{') {
//                stack.pop();
//            } else isBalanced = false;
//        }
//        if (ch == ']') {
//            if (stack.peek() == '[') {
//                stack.pop();
//            } else isBalanced = false;
//        }
//    }
//
//    return isBalanced;
//}
//
//    public static void main(String []argh)
//    {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String input=sc.next();
//            System.out.println(isBal(input));
//        }
//    }
//}
//
//
//
//
