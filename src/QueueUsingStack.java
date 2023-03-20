public class QueueUsingStack<T> {

    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();
    public void enQueue(T x){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack1.push(x);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public T deQueue(){
       if(stack1.isEmpty()){
           System.out.println("Queue is Empty");
           System.exit(0);
       }
        return stack1.pop();
    }
}
