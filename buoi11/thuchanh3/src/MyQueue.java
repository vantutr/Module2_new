public class MyQueue {

    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        return (currentSize == capacity);
    }

    public boolean isQueueEmpty() {
        return (currentSize == 0);
    }

    public void enqueue(int data) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            tail = (tail + 1) % capacity;
            queueArr[tail] = data;
            currentSize++;
            System.out.println("Đã thêm " + data + " vào Queue");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        head = (head + 1) % capacity;
        currentSize--;
        System.out.println("Đã xóa " + head + " khỏi Queue");
    }
}
