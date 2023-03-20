public class Main {
    public static void main(String[] args) {
        QueueUsingStack<Integer> q = new QueueUsingStack<Integer>();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}