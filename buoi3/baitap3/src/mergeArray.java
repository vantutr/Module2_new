import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử thứ 1: ");
        int number1 = sc.nextInt();
        int[] arr1 = inputArray(sc, number1);

        System.out.print("Nhập số lượng phần tử thứ 2: ");
        int number2 = sc.nextInt();
        int[] arr2 = inputArray(sc, number2);

        int[] arr3 = mergeArrays(arr1, arr2);

        System.out.println("Mảng gộp từ mảng 1 và 2 là: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }

    public static int[] inputArray(Scanner sc, int number) {
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.printf(" Nhập phần tử thứ %d: ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[i + arr1.length] = arr2[i];
        }
        return result;
    }
}
