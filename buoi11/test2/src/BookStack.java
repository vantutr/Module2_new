public class BookStack<E> {
    private static final int INITIAL_SIZE = 10;
    private E[] stack;
    private int count = 0;

    public BookStack() {
        stack = (E[]) new Object[INITIAL_SIZE];
    }

    public void push(E item) {
        ensureCapacity();
        stack[count++] = item;
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        E item = stack[--count];
        stack[count] = null; // tránh memory leak
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    private void ensureCapacity() {
        if (count >= stack.length) {
            E[] newStack = (E[]) new Object[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, count);
            stack = newStack;
        }
    }

    public int search(E item) {
        for (int i = count - 1, pos = 1; i >= 0; i--, pos++) {
            if (stack[i].equals(item)) {
                return pos;
            }
        }
        return -1; // Không tìm thấy
    }

    public void printStack() {
        System.out.println("Stack (top to bottom):");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println("- " + stack[i]);
        }
    }
}
