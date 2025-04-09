import java.util.Scanner;

public class DeleteNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xóa: ");
        int n = sc.nextInt();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = numberIndex(n, a);
        if (index != -1){
            deleteNumber(index, a);
            for(int i = 0; i < a.length - 1; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.printf("Không có phần tử %d trong mảng", n);
        }
    }
    public static int numberIndex(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static int[] deleteNumber(int index, int[] arr) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr;
    }
}
