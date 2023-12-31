package linkedList;

public class circularLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        System.out.println(list.countLoop(list.head));
        list.print();
        System.out.println();
        System.out.println(list.hasCycle());
        list.removeCycle();
        System.out.println(list.hasCycle());

        Node head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        

    }
}

class LinkedList {
    Node head;
    Node temp;

    // Node tail;
    LinkedList() {
        head = null;
        temp = null;
        // tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            temp = node;
            // tail = node;
        } else {
            temp.next = node;
            temp = node;
            temp.next = head;
            // tail.next = node;
            // tail = node;
            // tail.next = head;
        }
    }

    public int countLoop(Node p) {
        Node fast = p;
        Node slow = p;
        Boolean check = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                check = true;
                break;
            }
        }
        int count = 1;
        if (check) {
            slow = slow.next;
            while (slow != head) {
                slow = slow.next;
                count++;
            }
        } else {
            return 0;
        }
        return count;
    }

    public void print() {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.print(temp.next.data + " ");
    }

    public boolean hasCycle() {
        if (head == null) {
            return false;
        }
        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }

    public  void removeCycle() {
        //detect cycle
        Node hare = head;
        Node turtle = head;
        boolean cycle = false;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        //find meeting point
        turtle = head;
        Node prev = null;//last node
        while(turtle != hare) {
            prev = hare;
            turtle = turtle.next;
            hare = hare.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}