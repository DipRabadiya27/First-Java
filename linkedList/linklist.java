package linkedList;
import java.util.*;

public class linklist {
    public static void main(String[] args) {
        LinkedL list = new LinkedL();

        list.print();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.print();
        list.find(30);
    }
}

class LinkedL{
    Node head;
    Node tail;

    LinkedL(){
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = tail.next;
        }
    }

    public void update(int old, int newValue) {
        Node temp = head;
        while (temp != null){
            if(temp.data == old){
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }

    public void find(int value) {
        Node temp = head;
        while (temp != null){
            if(temp.data == value){
                System.out.println("present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("not present");
    }

    public void print() {
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void delete(int data) {
        if(head.data == data){
            head = head.next;
        }else {
            Node temp = head;
            while (temp != null){
                if(temp.next.data == data){
                    if(temp.next == tail){
                        temp.next = null;
                        tail = temp;
                        return;
                    }else {
                        temp.next = temp.next.next;
                        return;
                    }
                }
                temp = temp.next;
            }
        }
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}