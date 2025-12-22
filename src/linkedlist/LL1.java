package linkedlist;

public class LL1 {
    private Node head;
    private Node tail;
    private int size;

    public LL1(){
        this.size = 0;
    }
    public void  insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail == null){
            tail=head;
        }
        size++;
    }



    class Node{
        private int  val;
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
