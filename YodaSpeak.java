/*6. Master Yoda, a renowned Jedi Master from the Star Wars universe, is known 
for his unique way of speaking. He often reverses the order of words in his 
sentences. For example, instead of saying "I am home" he might say "Home 
am I" Design a function that takes a sentence as input and returns a new 
sentence with the words reversed in the same order that Master Yoda would 
use */

public class YodaSpeak {
    public static String yodaSpeak(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder yodaSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            yodaSentence.append(words[i]).append(" ");
        }

        return yodaSentence.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(yodaSpeak("I am home")); // Output: "home am I"
        System.out.println(yodaSpeak("Today is a very good day")); // Output: "day good very a is Today"
    }
}
