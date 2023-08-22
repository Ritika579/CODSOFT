
import java.util.*;

public class CountingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text:");
        String sc = scanner.nextLine();

        String[] words = sc.split("[\\s.,;!?]+");
        int totalWordCount = words.length;

        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "and", "is", "in", "a", "to"));
        int nonStopWordCount = 0;
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (!stopWords.contains(word)) {
                nonStopWordCount++;
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Total word count: " + totalWordCount);
        System.out.println("Non-stop word count: " + nonStopWordCount);
        System.out.println("Unique word count: " + wordFrequencyMap.size());

        System.out.println("Word frequency statistics:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
