import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest<T> {

    Stack<Integer> stack ;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
    }

    @Test
    void shouldPushAnElementToStack() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();


        assertEquals(40,stack.peek());

    }
}