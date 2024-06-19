/*4. Design a function that determines whether a given string is a pangram. A 
pangram is a sentence or phrase containing every letter of the alphabet at 
least once. Punctuation and case are typically ignored. For example, the 
string "The quick brown fox jumps over the lazy dog" is a pangram, while 
"Hello, world!" is not.*/

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The five boxing wizards jump quickly")); // Output: true
        System.out.println(isPangram("Hello, world!")); // Output: false
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // Output: true
        System.out.println(isPangram("This is not a pangram")); // Output: false
    }
}
