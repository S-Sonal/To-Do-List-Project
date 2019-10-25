import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class unitTesting {
    @Test
    void testIsEmptyFalse(){
        Stack stack = new Stack();
        stack.push(5);
        boolean isEmpty = stack.isEmpty();
        assertEquals(false, isEmpty);

    }
    @Test
    void testIsEmptyTrue(){
        Stack stack = new Stack();
        boolean isEmpty = stack.isEmpty();
        assertEquals(true, isEmpty);

    }

    @Test
    void testPushAndPop(){
        Stack stack = new Stack();
        stack.push(4);
        int result = (int) stack.pop();
        assertEquals(4, result);

    }
}




