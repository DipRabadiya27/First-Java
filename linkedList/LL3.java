package linkedList;
import java.util.LinkedList;

public class LL3 {

    Node head;
    private int size;

    LL3() {
        this.size=0;
    }

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    
    //add - first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next=head;
        head = newNode;
    }

    //add - last
    public void addLast(int i) {
        Node newNode = new Node(i);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> " );
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode = null
        while(lastNode.next != null) { // null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //size
    public int getSize(){
        return size;
    }

    //reverse
    public void reverseIterate() {
        Node prevNode = head;
        Node currNode = head.next;
        


    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        
    }
}