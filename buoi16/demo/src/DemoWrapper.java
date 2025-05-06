import java.util.ArrayList;

public class DemoWrapper {
    public static void main(String[] args) {
        // Autoboxing
        int a = 10;
        Integer obj = a; // int -> Integer

        // Unboxing
        int b = obj; // Integer -> int

        // Dùng với ArrayList (chỉ nhận object)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // autoboxing
        list.add(2);
        list.add(3);

        for (Integer number : list) {
            System.out.println(number); // unboxing ngầm
        }

        // Dùng method
        String str = "123";
        int parsed = Integer.parseInt(str); // parse String -> int
        System.out.println(parsed + 100); // 223
    }
}
