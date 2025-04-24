import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(sc, arr);

        System.out.println("Quy trình xử lý sắp xếp...");
        sortbubbleSort(arr);
        System.out.print("Mảng sau khi được sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void inputArray(Scanner sc, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ [%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    public static void sortbubbleSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mảng đã được sắp xếp và không cần lần duyệt tiếp theo!");
                break;
            }

            System.out.println("Liệt kê theo thứ tự sắp xếp thứ " + i + ":");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }
}