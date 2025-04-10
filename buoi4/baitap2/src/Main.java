//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < 200000000; i++) {

        }
        sw.end();
        System.out.println("Thời gian đã trôi qua là: " + sw.getElapsedTime());
    }
}