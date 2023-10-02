/**
 * This class tests the Dictionary class.
 */
public class Application {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        dict.load("C:\\Users\\steph\\OneDrive\\Old\\Desktop\\DictionaryWordValuePairs.csv");
        dict.print();
        dict.search("damsel");
        dict.search("gyve");
        dict.search("dispraise");
        dict.search("ceil");
        dict.search("maid");
    }
}