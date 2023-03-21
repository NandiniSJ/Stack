public class Main {
    public static void main(String[] args) {
//        QueueUsingStack<Integer> q = new QueueUsingStack<Integer>();
//        q.enQueue(1);
//        q.enQueue(2);
//        q.enQueue(3);
//        q.enQueue(4);

//        System.out.println(q.deQueue());
//        System.out.println(q.deQueue());
//        System.out.println(q.deQueue());
//        System.out.println(q.deQueue());

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(16);
        stack.push(29);
        stack.push(15);
        stack.push(19);
        stack.push(18);

        System.out.println(stack.getMin());
        System.out.println(stack.getMin());


    }
}