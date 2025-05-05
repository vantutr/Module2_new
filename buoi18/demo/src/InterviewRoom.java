public class InterviewRoom {
    public void interview(String name) {
        System.out.println(name + " đang vào phỏng vấn...");
        try {
            Thread.sleep(1000); // Giả lập thời gian phỏng vấn
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " đã phỏng vấn xong.");
    }

}
