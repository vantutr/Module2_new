import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity;
        do{
            System.out.println("Nhập số lượng sinh viên (tối đa 30): ");
            quantity = sc.nextInt();
            if(quantity <= -1 || quantity > 30){
                System.out.println("Số nhập vào không hợp lệ");
            }
        } while(quantity <= -1 || quantity > 30);
        float[] arrStudent = inputArray(sc, quantity);

        System.out.printf("Có %d sinh viên thi đỗ", countStudentPass(arrStudent));
    }
    public static float[] inputArray(Scanner sc, int number) {
        float[] arr = new float[number];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Nhập điểm của sinh viên thứ " + (i + 1));
            arr[i] = sc.nextFloat();
        }
        return arr;
    }
    public static int countStudentPass(float[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 5.0){
                count++;
            }
        }
        return count;
    }
}
