package linkedlist;

public class Middle {
    private Node head;
    private Node tail;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }

    }

    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.val + "  -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node middleOfTheLinkedList(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private class Node{
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

    public static void main(String[] args) {
        Middle list = new Middle();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.display();
        Node middle = list.middleOfTheLinkedList(list.head);
        System.out.println((middle.val));
    }

}
