import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr, sc);

        System.out.print("mảng nhập vào là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


        insertionSort(arr);
        System.out.print("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public static void inputArray(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            array[i] = sc.nextInt();
        }
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && array[pos - 1] > x) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}