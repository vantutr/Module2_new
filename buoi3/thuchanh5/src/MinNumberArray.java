public class MinNumberArray {
    public static void main(String[] args) {
        int[] a = {12, 2, 3, 4, 1, 6, 7, 8, 9, 10};
        System.out.println("Giá trị nhở nhất trong mảng là: " + minNumber(a));
    }
    public static int minNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
