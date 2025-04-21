import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int a : arr) {
            stack.push(a);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.print("Mảng sau khi đảo ngược: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}