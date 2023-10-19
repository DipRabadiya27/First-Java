package linkedList;

import java.util.LinkedList;

public class remove_nth_node_last {

    Node head;
    private int size;

    remove_nth_node_last() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(int i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode = null
        while (lastNode.next != null) { // null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // size
    public int getSize() {
        return size;
    }

    // reverse
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public Node removeNthFromEnd(int n) {
        if (head.next == null) {
            return null;
        }

        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        Node prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }

    public Node findMiddle(Node node){
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        Node middle = findMiddle(head); //1sthalfend
        Node secondHalfStart = reverseRecursive(middle.next);

        Node firstHalfStart = head;
        while(secondHalfStart != null) {
            if(firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }

    public boolean hasCycle(){
        if(head == null){
            return false;
        }
        Node hare = head;
        Node turtle = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        remove_nth_node_last list = new remove_nth_node_last();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.printList();

        list.removeNthFromEnd(3);
        list.printList();
        System.out.println(list.isPalindrome());
        System.out.println(list.hasCycle());
    }
}