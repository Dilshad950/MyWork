public class MyDeque <E>{
    Node <E> head, tail;
    public void addToTail (E data){
        Node <E> toAdd = new Node<>(data);
        if (head == null){
            head = tail = toAdd;
            return;
        }
        tail.prev= toAdd;
        toAdd.next = tail;
        tail = tail.prev;
    }
    public void addToHead (E data){
        Node <E> toAdd = new Node<>(data);
        if (head == null){
            head = tail = toAdd;
            return;
        }
        head.next= toAdd;
        toAdd.prev = head;
        head= head.next;
    }
    public E removeFirst(){
        if (head == null){
            return null;
        }
        Node<E> toRemove = head;
        head = head.prev;
        head.next= null;
        if(head== null){
            tail = null;
        }
        return toRemove.data;
    }
    public E removeLast(){
        if (head == null){
            return null;
        }
        Node<E> toRemove = tail;
        tail = tail.next;
        tail.prev= null;
        if(tail== null){
            head = null;
        }
        return toRemove.data;
    }


    public static  class  Node<E>{
        E data ;
        Node prev,next;
        Node(E data){
            this.data = data;
            this.next = this.prev = null;
        }
    }
}

