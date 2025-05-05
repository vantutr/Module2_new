public class RunnableDemo implements Runnable {
    private Thread thread;
    private final String name;
    public RunnableDemo(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    @Override
    public void run() {
        System.out.println("Running " + name);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + name + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + name + " interrupted");
        }
        System.out.println("Thread: " + name + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + name);
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }
}
