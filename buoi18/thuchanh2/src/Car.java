import java.util.Random;

public class Car implements Runnable {
    private String nameCar ;

    public Car(String nameCar) {
        this.nameCar = nameCar;
        System.out.println("Car: " + nameCar);
    }

    @Override
    public void run() {
        int runStart = 0;
        long startTime = System.currentTimeMillis();
        while (runStart < Main.DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runStart += speed;
                String log = "|";
                int percentTravel = (runStart * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i+= Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    }
                    else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.nameCar + ": " + log + " " + Math.min(Main.DISTANCE, runStart) + "KM");
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Car" + this.nameCar + " broken...");
                break;            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.nameCar + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
