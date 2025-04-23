import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        inputArr(sc, arr);
        Arrays.sort(arr);

        System.out.print("Mảng sau khi được sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int left = 0, right = arr.length - 1;
        System.out.print("\nNhập giá trị cần tìm trong mảng: ");
        int value = sc.nextInt();
        int indexValue = binarySearch(arr, left, right, value);

        if (indexValue == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        } else {
            System.out.println("Phần tử " + value + " ở vị trí thứ: " + indexValue);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if (array[mid] > value) {
            return binarySearch(array, left, mid - 1, value);
        } else if (array[mid] < value) {
            return binarySearch(array, mid + 1, right, value);
        } else {
            return mid;
        }
}

//public static int[] sortArray(int[] arr) {
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//            if (arr[i] > arr[j]) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//    }
//    return arr;
//}

public static void inputArr(Scanner sc, int[] arr) {;
    for (int i = 0; i < arr.length; i++) {
        System.out.printf("Nhập phần tử thứ [%d]: ", i);
        arr[i] = sc.nextInt();
    }
}
}