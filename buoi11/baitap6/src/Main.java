import java.util.Stack;

public class Main {
    public static boolean isValidBracket(String expr) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char sym = expr.charAt(i);

            // Nếu là dấu mở
            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            }

            // Nếu là dấu đóng
            else if (sym == ')' || sym == '}' || sym == ']') {
                if (bStack.isEmpty()) {
                    return false; // không có dấu mở để khớp
                }
                char left = bStack.pop();

                if (!isMatchingPair(left, sym)) {
                    return false; // không khớp
                }
            }
        }

        // Nếu Stack rỗng => hợp lệ
        return bStack.isEmpty();
    }

    // Hàm so sánh 2 dấu ngoặc có khớp nhau không
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String expr1 = "{[()]}";
        String expr2 = "(([)])";
        String expr3 = "(A + B) * [C - {D / E}]";

        System.out.println(expr1 + " -> " + isValidBracket(expr1)); // true
        System.out.println(expr2 + " -> " + isValidBracket(expr2)); // false
        System.out.println(expr3 + " -> " + isValidBracket(expr3)); // true
    }
}
