package Queue;

import java.util.Arrays;

public class circular {
    static int arr[] = new int[5];
    static int rear = -1;
    static int front = -1;

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        add(40);
        add(50);
        remove();
        remove();
        add(70);
        add(80);
        add(90);
        System.out.println(peek());
        System.out.println(Arrays.toString(arr));
        print();
    }

    public static void add(int data) {
        if ((rear + 1) % arr.length == front) {
            System.out.println("Full Queue");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
    }

    public static void remove() {
        if (rear == -1 && front == -1) {
            System.out.println("Empty queue");
            return;
        }
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % arr.length;
        }
    }

    public static int peek() {
        if (rear == -1 && front == -1) {
            System.out.println("Empty queue");
            return -1;
        }
        return arr[front];
    }

    public static void print() {
        int j = front;
        do {
            System.out.println(arr[j]);
            j = (j + 1) % arr.length;
        } while (j != rear + 1);
    }
}