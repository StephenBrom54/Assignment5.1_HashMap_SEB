import java.util.*;
import java.io.*;

/**
 * This class represents a dictionary using Java HashMap.
 */
public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    /**
     * This method loads the unsorted key/definition pairs into the HashMap.
     * @param filename The name of the file to load.
     */
    public void load(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                dictionary.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method prints the unsorted dictionary keys and definitions from the hash map.
     */
    public void print() {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Definition: " + entry.getValue());
        }
    }
    /**
     * This method searches the dictionary for a key.
     * @param key The key to search for.
     */
    public void search(String key) {
        if (dictionary.containsKey(key)) {
            System.out.println("Word: " + key + ", Definition: " + dictionary.get(key) + ", HashKey: " + key.hashCode());
        } else {
            System.out.println("Word not found in dictionary.");
        }
    }
}

