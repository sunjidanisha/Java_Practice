import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        // Check if a filename was provided
        if (args.length != 1) {
            System.out.println("Usage: java WordCount <file-path>");
            return;
        }

        String filePath = args[0];
        Map<String, Integer> wordCountMap = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Split the line into words using non-word characters as delimiters
                String[] words = line.split("[\\W_]+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        // Convert the word to lowercase to ensure case-insensitive counting
                        word = word.toLowerCase();

                        // Update the word count in the map
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Display the word count in alphabetical order
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
