package linkedlist;


public class LL {


    private Node head;
    private Node tail;
    private int size;


    public LL() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
    Node node = new Node(val);
    tail.next = node;
    tail = node;

    if (tail == null){
        insertFirst(val);
    }
    size++;
    }

    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node =new Node(val,temp.next);
        temp.next = node;
        size++;
    }
   public int deleteFirst(){
    int val = head.val;
    head = head.next;
    if (head == null){
        tail = null;
    }
    size--;
    return val;
   }

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        Node temp = head;

        // reach second last node
        while (temp.next != tail) {
            temp = temp.next;
        }

        int val = tail.val;   // store last value
        tail = temp;          // update tail
        tail.next = null;     // remove last node
        size--;

        return val;
    }

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public int getLength(Node head){
        int length = 0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }
   public int getMiddle(){
        Node temp = head;
        int length = getLength(head);
        int midIndex = length/2;
        while (midIndex > 0){
            temp = temp.next;
            midIndex--;
        }
        return temp.val;
    }

    public  Node reverseLinkedList(Node head){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reverse() {
        head = reverseLinkedList(head);
    }


    public void display(){
      Node temp = head;
      while (temp!= null){
          System.out.print(temp.val + "  -> ");
          temp = temp.next;
      }
        System.out.println("END");
    }

    private class  Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }



}
