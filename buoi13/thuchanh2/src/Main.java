import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 chuỗi: "); //welcome
        String s = sc.nextLine();

        s = s.toLowerCase();

        String[] chars = s.split("");

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i])+1);
            } else {
                map.put(chars[i], 1);
            }
        }

        Set<String> keys = map.keySet();
        int max = 0;
        String result = "";
        for (String key : keys) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }
        System.out.println("Ký tự xuấn hiện nhiều nhất: " + result + ". Số lần xuất hiện: " + max);
    }
}