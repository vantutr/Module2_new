import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        inputArray(sc, arr);

        System.out.print("Mảng ban đầu: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("\nQuá trình thực hiện sắp xếp chèn:");
        insertionSortByStep(arr);
    }

    public static void inputArray(Scanner sc, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ [%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    public static void insertionSortByStep(int[] list) {
        boolean stoppedEarly = false;

        for (int i = 1; i < list.length; i++) {
            int x = list[i];
            int pos = i;

            while (pos > 0 && list[pos - 1] > x) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;

            System.out.print("Bước " + i + ": ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + " ");
            }
            System.out.println();

            if (isSorted(list) && i < list.length - 1) {
                stoppedEarly = true;
                break;
            }
        }

        if (stoppedEarly) {
            System.out.println("Mảng đã được sắp xếp và không cần lần duyệt tiếp theo!");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }



}
