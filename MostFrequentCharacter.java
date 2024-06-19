/*3. Design a function that takes a string or sequence of characters as input and 
returns the character that appears most frequently.
Eg 11189 => '1'
hello => l*/

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static char mostFrequent(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = '\0';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent("11189")); // Output: '1'
        System.out.println(mostFrequent("hello")); // Output: 'l'
        System.out.println(mostFrequent("abracadabra")); // Output: 'a'
        System.out.println(mostFrequent("aabbbcc")); // Output: 'b'
    }
}
