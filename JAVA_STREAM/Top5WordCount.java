import java.io.*;
import java.util.*;

public class Top5WordCount {
    public static void main(String[] args) {
        String file = "words.txt";
        Map<String, Integer> freq = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.replaceAll("[.,!?]", "").toLowerCase().split("\\s+")) {
                    if (!word.isEmpty()) freq.put(word, freq.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) { e.printStackTrace(); }
        freq.entrySet().stream()
            .sorted((a,b) -> b.getValue()-a.getValue())
            .limit(5)
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
