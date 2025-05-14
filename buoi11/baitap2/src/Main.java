import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String input = "Mưa rơi ngoài hiên, mưa rơi trên mái, mưa lặng lẽ trôi qua những tán lá xanh. " +
                "Trong lòng tôi cũng có mưa, mưa của những ngày xưa cũ, mưa của những kỷ niệm không tên";

        input = input.toLowerCase();

        String[] words = input.split("[\\s.,;:!?()\"'-]+");

        Map<String, Integer> wordMap = new TreeMap<>();

        for (String word : words) {
//            if (word.isEmpty()) {
//                continue;
//            }

            if (wordMap.containsKey(word)) {
              wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("\nSố lần xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}