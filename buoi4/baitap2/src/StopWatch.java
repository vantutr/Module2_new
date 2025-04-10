public class StopWatch {
    private long startTime, endTime;
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void end() {
        endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
