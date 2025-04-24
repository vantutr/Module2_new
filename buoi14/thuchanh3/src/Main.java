//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        System.out.print("Mảng sau khi sắp xếp chọn: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void selectionSort(double[] list) {
        int min;
        for (int i = 0; i < list.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            if (min != i) {
                double temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }
}