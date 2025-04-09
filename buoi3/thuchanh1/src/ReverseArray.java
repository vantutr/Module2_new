import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element;
        do {
            System.out.println("Nhập số phần tử của mảng (tối đa 20): ");
            element = sc.nextInt();
        } while(element < 0 || element > 20);
        int[] arr = new int[element];
        for (int i = 0; i < element; i++) {
            System.out.println("Phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Các phần tử vừa nhập là:");
        for (int i = 0; i < element; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[element - 1 - i];
            arr[element - 1 - i] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
