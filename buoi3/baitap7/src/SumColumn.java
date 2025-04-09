import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row1 = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int column1 = sc.nextInt();
        float[][] arr = inputArray(sc,row1, column1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }
        System.out.print("\nNhập cột muốn tính tổng: ");
        int column2 = sc.nextInt();
        System.out.printf("\nTổng cột %d của mảng là: %.2f ", column2, sumColumnArray(arr,column2));

    }
    public static float[][] inputArray(Scanner sc, int row, int column) {
        float[][] arr = new float[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập phần tử thứ [%d] [%d]: ", i, j);
                arr[i][j] = sc.nextFloat();
            }
        }
        return arr;
    }
    public static float sumColumnArray(float[][] arr, int column) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
              sum += arr[i][column];
            }
        return sum;
    }

}
