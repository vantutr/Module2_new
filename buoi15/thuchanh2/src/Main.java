import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer[] arr = createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập chỉ số của phần tử muốn lấy giá trị: ");
        int index = sc.nextInt();
        try {
            System.out.printf("Giá trị của arr[%d]: %d ", index, arr[index]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng(0-99)!");
        }
    }

    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}