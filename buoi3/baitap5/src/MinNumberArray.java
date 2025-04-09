import java.util.Scanner;

public class MinNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
    }

}
