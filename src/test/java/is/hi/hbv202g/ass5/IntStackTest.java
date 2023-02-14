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


    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }


    @Test
    public void testFullStackIsFull() {
        int c = stack.getCapacity();

        for (int i = 0; i < c; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }


    @Test
    public void testAlmostFullStack() {
        int c = stack.getCapacity();

        for (int i = 0; i < c-2; i++) {
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        int n = 2;
        stack.push(n);
        int m = stack.pop();
        assertEquals(n,m);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testExceptionPoppingEmptyStack() {
        stack.pop();
    }


    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testExceptionPushingFullStack() {
        int c = stack.getCapacity();

        for (int i = 0; i < c; i++) {
            stack.push(i);
        }
        stack.push(c);
    }

    @Test
    public void testEmptyStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }


    @Test
    public void testAlmostEmptyStack() {
        for (int i = 0; i < 1; i++) {
            stack.push(i);
        }
        assertFalse(stack.isEmpty());
    }







}
