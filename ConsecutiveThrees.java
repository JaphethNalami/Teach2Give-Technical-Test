/* 5.Design a function that takes a list of integers as input. The function should 
return True if the list contains two consecutive threes (3 next to a 3) anywhere 
within the list. Otherwise, it should return False. For example, the function 
should return True for [1, 3, 3] and False for [1, 3, 1, 3].*/

public class ConsecutiveThrees {
    public static boolean hasConsecutiveThrees(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasConsecutiveThrees(new int[]{1, 3, 4, 3})); // Output: true
        System.out.println(hasConsecutiveThrees(new int[]{1, 3, 1, 3})); // Output: false
    }
}
