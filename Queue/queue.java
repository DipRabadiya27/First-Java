package Queue;

public class queue {
    static int[] queue = new int[5];
    static int front = -1, rear = -1;

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        print();
        dequeue();
        print();
        enqueue(40);
        enqueue(50);
        print();
        enqueue(60);
    }

    private static void dequeue() {
        if(rear == front) {
            System.out.println("Queue is empty");
            return;
        }
        front++;
        System.out.println(queue[front] + " is remove");
    }

    private static void print() {
        if (rear == front) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    private static void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = value;
    }
}