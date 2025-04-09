//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1, 6, 7, 8, 9, 10};
        int[] b = changeNumber(a);
        for (int num : b) {
            System.out.print(num + " ");
        }

    }
    public static int[] changeNumber(int[] arr) {
        arr[0] = 100;
        return arr;
    }

}