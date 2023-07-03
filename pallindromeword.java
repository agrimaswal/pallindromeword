//pallindrome word

public class pallindromeword {
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        if(isPalindrome(str)){
            System.out.println(str+" is pallindrome");
        }else{
            System.out.println(str+" is not pallindrome");
        }
    }
}

