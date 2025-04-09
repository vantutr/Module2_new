import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng - cột: ");
        int row1 = sc.nextInt();
        int column1 = row1;
        float[][] arr = inputArray(sc,row1, column1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }
        System.out.println("\nTổng 2 đường chéo của mảng là: "+ sumDiagonal1(arr) + " và " + sumDiagonal2(arr));

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
    public static float sumDiagonal1(float[][] arr) {
        float sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
        }
        return sum1;
    }
    public static float sumDiagonal2(float[][] arr) {
        float sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i][arr.length - 1 - i];
        }
        return sum2;
    }

}
