package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    IntStack stack;

    @Before
    public void createEmptyStack(){
        stack = new IntStack();
    }

    /**
     * Test that checks if the new stack is not full.
     */
    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    /**
     * Test that checks if a full stack is indeed full.
     */
    @Test
    public void testFullStackIsFull() {
        int c = stack.getCapacity();

        for (int i = 0; i < c; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    /**
     * Test that checks if an almost full stack is not full.
     */
    @Test
    public void testAlmostFullStack() {
        int c = stack.getCapacity();

        for (int i = 0; i < c-2; i++) {
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }

    /**
     * Test that checks that the value that has been pushed is later popped again, checks if it is the same value.
     */
    @Test
    public void testPopReturnsPushedValue() {
        int n = 2;
        stack.push(n);
        int m = stack.pop();
        assertEquals(n,m);
    }

    /**
     * Test that checks if pop on an empty stack returns an exeption ArrayIndexOutOfBoundsException.
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testExceptionPoppingEmptyStack() {
        stack.pop();
    }

    /**
     * Test that checks if push on full stack returns an exception ArrayIndexOutOfBoundsExeption.
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testExceptionPushingFullStack() {
        int c = stack.getCapacity();

        for (int i = 0; i < c; i++) {
            stack.push(i);
        }
        stack.push(c);
    }

    /**
     * Test that checks if an empty stack is empty.
     */
    @Test
    public void testEmptyStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    /**
     * Test that checks if an almost empty stack says it is empty.
     */
    @Test
    public void testAlmostEmptyStack() {
        for (int i = 0; i < 1; i++) {
            stack.push(i);
        }
        assertFalse(stack.isEmpty());
    }







}
