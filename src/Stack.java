public class Stack<T> {

    private Node<T> top;
    private int length;

   public int length(){
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

    public boolean isEmpty(){
        return length == 0;
    }
}
