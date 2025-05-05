import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String EMAIL_REGEX = "^[\\w]+@[\\w]+\\.[a-zA-Z]{2,}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        if (checkEmail(email)) {
            System.out.println("Email hợp lệ!");
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }

    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}