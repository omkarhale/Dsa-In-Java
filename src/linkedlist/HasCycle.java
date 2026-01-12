package linkedlist;

public class HasCycle {
    private Node head;

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
   public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
   }

    public int lengthOfCycle(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
           if (slow == fast){
               Node temp = slow;
               int length = 0;
               do {
                   temp = temp.next;
                   length++;
               }while (temp != slow);
                   return length;
           }
        }
        return 0;
    }



    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        HasCycle list = new HasCycle();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

//        System.out.println("Original List:");
//        list.display();
        System.out.println(list.hasCycle(list.head));
        System.out.println(list.lengthOfCycle(list.head));


        System.out.println("List After Removing Duplicates:");
        list.display();
    }
}
