package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class reverse_Kth_item {
    public static void main(String[] args) {
        int k = 3;
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        Deque<Integer> extraQueue = new ArrayDeque<Integer>();
        for (int i = 0; i < k; i++) {
            extraQueue.add(queue.removeFirst());
        }
        while (!extraQueue.isEmpty()) {
            queue.addFirst(extraQueue.removeFirst());
        }
        System.out.println("before update :" + queue);
    }
}