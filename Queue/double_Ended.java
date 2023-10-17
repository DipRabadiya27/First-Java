package Queue;

import java.util.Arrays;

public class double_Ended {
    static int[] queue = new int[5];
    static int leftR = -1, rightR = queue.length;
    static int left = -1, right = queue.length;

    public static void main(String[] args) {
        leftEnque(10);
        leftEnque(20);
        leftEnque(30);
        //leftEnque(40);
        //leftEnque(50);
        //leftEnque(60);
        rightEnque(60);
        rightEnque(50);
        print();
    }

    private static void rightEnque(int value) {
        if(right==left){
            System.out.println("queue is full");
        }
        right--;
        queue[right]=value;
    }

    private static void leftEnque(int value) {
        if (left == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        left++;
        queue[left]=value;
    }

    private static void print() {
        if (left == right) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = leftR + 1; i <= right; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}