package linkedlist;

public class EvenOdd {
    private Node head;
    private Node tail;
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node evenOdd() {
        if (head == null) {
            return null;
        }
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;

        Node curr = head;

        while (curr != null) {
            if (curr.val % 2 == 0) {
                if (evenHead == null) {
                    evenHead = curr;
                    evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            } else {
                if (oddHead == null) {
                    oddHead = curr;
                    oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }
            curr = curr.next;
        }

        if (evenTail != null) {
            evenTail.next = oddHead;
        }
        if (oddTail != null) {
            oddTail.next = null;
        }

        return evenHead != null ? evenHead : oddHead;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        EvenOdd evenOddObj = new EvenOdd();
        evenOddObj.insert(17);
        evenOddObj.insert(19);
        evenOddObj.insert(23);
        evenOddObj.insert(4);
        evenOddObj.insert(8);
        evenOddObj.insert(6);

        System.out.println("Original List:");
        evenOddObj.display(evenOddObj.head);

        Node result = evenOddObj.evenOdd();
        System.out.println("Even-Odd Rearranged List:");
        evenOddObj.display(result);
    }


}