/*1. Design a function that reverses the digits of an integer. For example, 50 
should become 5 and -12 should become -21.*/

public class integerReverse {
    public static int reverse(int number) {
        int reversed = 0;
        boolean isNegative = number < 0;
        number = Math.abs(number);

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(50)); // Output:5
        System.out.println(reverse(-12)); // Output: -21
    }
}
