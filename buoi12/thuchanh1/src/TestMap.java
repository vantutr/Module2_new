import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Long", 20);
        hashMap.put("Khánh", 22);
        hashMap.put("Tú", 21);
        hashMap.put("Tùng", 30);
        hashMap.put("Hưng", 18);
        hashMap.put("Khánh", 28);

        System.out.println(hashMap + " ");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap + " ");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Long", 20);
        linkedHashMap.put("Khánh", 22);
        linkedHashMap.put("Tú", 21);
        linkedHashMap.put("Tùng", 30);
        linkedHashMap.put("Hưng", 18);
        linkedHashMap.put("Khánh", 28);
        System.out.println("\nTuổi của Tú là: " + linkedHashMap.get("Khánh"));
    }
}
