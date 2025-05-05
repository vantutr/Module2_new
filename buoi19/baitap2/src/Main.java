import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.next();
        if (checkPhone(phone)) {
            System.out.println("Số điện thoại hợp lệ!");
        } else {
            System.out.println("Số điện thoại không hợp lệ!");
        }
    }
    public static boolean checkPhone(String phone) {
        Pattern pattern = Pattern.compile("^\\d{2}-0\\d{9}$");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}