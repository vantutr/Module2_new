import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] names = { "Tú", "Khánh", "Tùng", "Long", "Hiếu" };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên trong mảng: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println("Sinh viên " + name + " nằm ở vị trí " + i);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Sinh viên " + name + " không có trong mảng");
        }
    }
}
