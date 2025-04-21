public class Queue {
    private Node front;
    private Node rear;
    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enQueue(int key) {
        Node newNode = new Node(key);
        if (this.front == null) {
            this.front = this.rear = newNode;
            this.rear.link = this.front;
        } else {
            this.rear.link = newNode;
            this.rear = newNode;
            this.rear.link = this.front;
        }

//        if (this.rear == null) {
//            this.front = this.rear = newNode;
//            return;
//        }
//        this.rear.link = newNode;
//        this.rear = newNode;
    }

    public void deQueue() {
        if (this.front == null) {
            System.out.println("Queue đang rỗng");;
            return;
        }
        if (this.front == this.rear) {
            System.out.println("Xóa: " + this.front.data);
            this.front = this.rear = null;
        } else {
            System.out.println("Xóa: " + this.front.data);
            this.front = this.front.link;
            this.rear.link = this.front;
        }
    }

    public void displayQueue() {
        if (this.front == null) {
            System.out.println("Queue đang rỗng");;
            return;
        }
        Node temp = this.front;
        System.out.print("Tất cả phần tử: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != this.front);
        System.out.println();
    }
}
