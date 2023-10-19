package Queue;

public class double_Ended {
    static int[] queue = new int[4];
    static int front = -1;
    static int rear = -1;
    public static void main(String[] args) {
        push_back(10);
        push_back(50);
        push_back(20);
        pop_back();
        pop_front();
        push_back(70);
        push_back(100);
        display();
        System.out.println(size());
    }

    public static void push_back(int val){
        if(isFull()){
            System.out.println("Queue is full !!");
            return;
        }
        rear++;
        queue[rear] = val;
    }

    public static void push_front(int val){
        if(isFull()){
            System.out.println("Queue is full !!");
            return;
        }
        int i;
        for (i = rear; i > front ; i--) {
            queue[i+1] = queue[i];
        }
        queue[i+1] = val;
        rear = rear + 1;
    }

    public static boolean isFull(){
        return rear == queue.length-1;
    }

    public static void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return;
        }
        for (int i = (front+1); i <= rear; i++) {
            System.out.print(queue[i]+" ");
        }
    }

    public static void pop_front(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return;
        }
        int i;
        for (i = front+1; i <rear ; i++) {
            queue[i] = queue[i+1];
        }
        if(front==rear){
            front = rear = -1;
        }
        rear--;
    }
    public static void pop_back(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return;
        }
        rear--;
        if(front==rear){
            front = rear = -1;
        }
    }
    public static boolean isEmpty(){
        return rear == -1;
    }

    public static int size(){
        return rear - front;
    }
}