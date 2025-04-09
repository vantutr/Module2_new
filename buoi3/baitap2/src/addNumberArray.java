import java.util.Scanner;

public class addNumberArray {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chèn: ");
        int n = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn n: ");
        int index = sc.nextInt();
        if (index <= -1 && index >= a.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            addNumber(n, index, a);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static int[] addNumber(int number, int index, int[] arr) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i];
        }
        arr[index] = number;
        return arr;
    }
}
