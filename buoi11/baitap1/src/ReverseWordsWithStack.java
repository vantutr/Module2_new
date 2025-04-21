import java.util.Stack;

public class ReverseWordsWithStack {
    public static void main(String[] args) {
        String input = "Tran Van Tu";

        String[] words = input.split(" ");

        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
        }

        String output = "";
        while (!stack.isEmpty()) {
            output += stack.pop();
            if (!stack.isEmpty()) {
                output += " ";
            }
        }

        System.out.println("Chuỗi sau khi đảo từ: " + output);
    }
}
