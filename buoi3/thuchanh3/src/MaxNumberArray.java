import java.util.Scanner;

public class MaxNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element;
        do {
            System.out.println("Nhập số phần tử của mảng (tối đa 20): ");
            element = sc.nextInt();
            if (element > 20 || element < 0)
                System.out.println("Số bạn nhập không hợp lệ. Nhập lại!");
        } while(element < 0 || element > 20);
        int[] arr = new int[element];
        for (int i = 0; i < element; i++) {
            System.out.println("Phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        int index = -1, max = arr[0];

        for (int i = 0; i < element; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max + " ở vị trí thứ " + index);
    }
}
