import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên lớp học: ");
        String className = scanner.next();
        if (checkClass(className)) {
            System.out.println("Tên lớp hợp lệ!");
        } else {
            System.out.println("Tên lớp không hợp lệ!");
        }
    }
    public static boolean checkClass(String className) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}