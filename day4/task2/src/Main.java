import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] words = Text.TEXT.toLowerCase().split("\\s+");
        String[] words1 = Text.TEXT.split("\\s+");

        Set<String> targetSet = new HashSet<String>(Arrays.asList(words));

        System.out.printf("There are %d words in the TEXT\n", words.length);
        System.out.printf("There are %d unique words in the TEXT not ignoring the case\n", new HashSet<String>(Arrays.asList(words1)).size());
        System.out.printf("There are %d unique words in the TEXT ignoring the case", targetSet.size());
        
    }
}


// Write a program which counts how many unique words are in text (see class Text, variable TEXT as a comment here)
//Think of how you could use any of the Set implementation to implement
//this program.

// Bonus:
// Ignore case sensitivity. For example, Apple and apple should be counted as the same word.
//Hint: to get the text as an String array can be regular expression used e.g.: String[] words = Text.TEXT.split("\\s+");

