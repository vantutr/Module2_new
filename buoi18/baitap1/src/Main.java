//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberGenerator gen1 = new NumberGenerator();
        NumberGenerator gen2 = new NumberGenerator();

        Thread thread1 = new Thread(gen1, "Thread-1");
        Thread thread2 = new Thread(gen2, "Thread-2");

        // Đặt độ ưu tiên cho thread
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}