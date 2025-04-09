import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "Vietnamese";
        System.out.print("Nhập ký tự cần đếm: ");
        char inputChar = sc.next().charAt(0);
        int count = countCharacterToString(input, inputChar);
        if (count > 0) {
            System.out.printf("Ký tự %c xuất hiện %d lần trong chuỗi %s", inputChar, count, input);
        } else {
            System.out.printf("Không có ký tự %c trong chuỗi", inputChar);
        }

    }
    public static int countCharacterToString(String str, char x) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        return count;
    }
}
