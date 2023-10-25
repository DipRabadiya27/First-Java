package linkedList;

public class remove_cycle {
    static Node head;
    static Node temp;

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

    public static  void print() {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.print(temp.next.data + " ");
    }

    public static boolean hasCycle() {
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

    public static void removeCycle() {
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
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        print();
        System.out.println(hasCycle());
        // removeCycle();
        // System.out.println(hasCycle());
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}