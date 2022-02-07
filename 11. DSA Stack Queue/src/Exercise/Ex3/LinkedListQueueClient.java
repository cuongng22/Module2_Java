package Exercise.Ex3;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();

        queue.enqueue(24);
        queue.enqueue(7);
        queue.enqueue(202);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.dequeue().key);
        System.out.println("-==-");
        queue.enqueue(7);
        System.out.println(queue.dequeue().key);
    }
}
