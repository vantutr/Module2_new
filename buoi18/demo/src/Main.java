//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InterviewRoom room = new InterviewRoom();

        Thread p1 = new Thread(new Runnable() { //Tạo nhiệm vụ cho từng luồng (run()).
            @Override
            public void run() {
                room.interview("Người 1");
            }
        });

        Thread p2 = new Thread(new Runnable() {
            @Override
            public void run() {
                room.interview("Người 2");
            }
        });

        Thread p3 = new Thread(new Runnable() {
            @Override
            public void run() {
                room.interview("Người 3");
            }
        });

        p1.start();
        p2.start();
        p3.start();
    }
}