public class Stack<T> {

    private Node<T> top;
    private int length;

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
//
    }
}
