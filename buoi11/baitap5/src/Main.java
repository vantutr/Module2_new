import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";

        // Bỏ khoảng trắng, chuyển về chữ thường
        String cleaned = string.replaceAll(" ", "").toLowerCase();

        // Dùng Queue và Stack để kiểm tra
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleaned.length(); i++) {
            char ch = cleaned.charAt(i);
            queue.offer(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Chuỗi \"" + string + "\" là chuỗi palindrome.");
        } else {
            System.out.println("Chuỗi \"" + string + "\" không phải là chuỗi palindrome.");
        }
    }
}
