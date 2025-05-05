import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên tài khoản: ");
        String input = sc.nextLine();
        if (checkAccount(input)) {
            System.out.println("Account hợp lệ");
        } else {
            System.out.println("Account không hợp lệ");
        }
    }

    public static boolean checkAccount(String account) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }
}