public class Stack<T extends Comparable> {

    private Node<T> top;
    private int length;

    public int length() {
        return length;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNextNode(top);
        top = newNode;
        length++;
    }

    public T pop() {
        T result = top.getValue();
        top = top.getNextNode();
        length--;
        return result;
    }

    public T peek() {
        return top.getValue();
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public T getMin() {
        Stack<T> stack1 = new Stack<>();
        if (this.isEmpty()) {
            throw  new RuntimeException("Stack is empty");
        }

        T min = this.top.getValue();
        while (!this.isEmpty()) {

            if (min.compareTo(this.top.getValue()) > 0) {
                min = this.top.getValue();
            }
            stack1.push(this.pop());
        }
        while(!stack1.isEmpty()){
            this.push(stack1.pop());
        }
        return min;
    }

}
