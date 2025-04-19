import java.util.Arrays;

public class MyList<E> implements Cloneable{
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize =elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    public void add(int index, E element) {
        checkIndex(index);

        if (size == elements.length) {
            ensureCapa();
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);

        E e = (E) elements[index];

        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public MyList<E> cloneList() {
        MyList<E> newList = new MyList<>(this.elements.length);
        for (int i = 0; i < this.size; i++) {
            newList.add((E) this.elements[i]);
        }
        return newList;
    }


    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public void clear() {
        Arrays.fill(elements, null);
    }

    public void printList() {
        System.out.print("List: ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
