package zoho.set3;

import java.util.Arrays;

public class ReverseStringRecursive {
    public static void main(String[] args) {
        String input1 = "one two three";
        String output1 = reverseWords(input1);
        System.out.println(output1);
    }

    public static String reverseWords(String input) {

        String[] words = input.split(" ");

        if (words.length == 1) {
            return input;
        }

        String lastWord = words[words.length - 1];
        String[] remainingWords = Arrays.copyOfRange(words, 0, words.length - 1);
        String reversedSubstring = reverseWords(String.join(" ", remainingWords));

        return lastWord + " " + reversedSubstring;
    }
}
