import java.util.Scanner;

public class MaxNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row1 = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int column1 = sc.nextInt();
        int[][] arr = inputArray(sc,row1, column1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }
        System.out.println("\nGiá trị max của mảng là: " + maxNumberArray(arr));
    }
    public static int[][] inputArray(Scanner sc, int row, int column) {
        int[][] arr = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập phần tử thứ [%d] [%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int maxNumberArray(int[][] arr) {
        int max = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }
        return max;
    }
}
