public class Main {
    public static void main(String[] args) {
        Thread lazyThread = new Thread(new LazyPrimeFactorization());
        Thread optimizedThread = new Thread(new OptimizedPrimeFactorization());

        lazyThread.setName("LazyThread");
        optimizedThread.setName("OptimizedThread");

        lazyThread.start();
        optimizedThread.start();
    }
}
