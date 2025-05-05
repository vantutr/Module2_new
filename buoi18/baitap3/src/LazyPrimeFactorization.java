public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 2;
        while (number<100) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(Thread.currentThread().getName() + " (Lazy): " + number);
            }
            number++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
