package linkedList;

import java.util.*;

public class print_reverse {
    public static void main(String[] args) {
        LinkedL1 list = new LinkedL1();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.print();
        list.printR();
        list.countNode();
        list.length();
        list.getNNode(4);
        list.getEndNode(2);
    }
}

class LinkedL1 {
    Node head;
    Node tail;

    int totalNode = 0;

    LinkedL1() {
        head = null;
        tail = null;
    }

    public void getNNode(int value) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == value) {
                System.out.print("Get nth node in linked list: " + temp.data + " ");
                break;
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void getEndNode(int value) {
        if (value > totalNode) {
            System.out.println("Enter Correct Position..!!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < totalNode - value; i++) {
            temp = temp.next;
        }
        System.out.println("Get nth node from end in linked linked list: " + temp.data);
    }

    public void countNode() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Count nodes: " + count);
    }

    public void length() {
        Node temp = head;

        while (temp != null) {
            totalNode++;
            temp = temp.next;
        }
        System.out.println("Total Nodes In LinkedList is: " + totalNode);
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    public void update(int old, int newValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == old) {
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }

    public void find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("not present");
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printR() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();
    }

    public void delete(int data) {
        if (head.data == data) {
            head = head.next;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next.data == data) {
                    if (temp.next == tail) {
                        temp.next = null;
                        tail = temp;
                        return;
                    } else {
                        temp.next = temp.next.next;
                        return;
                    }
                }
                temp = temp.next;
            }
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}