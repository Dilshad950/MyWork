public class Main {
    public static void main ( String[] args){
        MyDeque<Integer> md = new MyDeque<>();
        md.addToHead(445);
        md.addToHead(55);
        md.addToHead(67);
        md.addToHead(24);

        System.out.println(md.removeFirst());
        System.out.println(md.removeFirst());
        System.out.println(md.removeFirst());
        md.addToHead(12);
        System.out.println(md.removeLast());

    }
}
