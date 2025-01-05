package stringsLesson;

public class HomeworkM4_2 {
    public static void main(String[] args) {
        HomeworkM4_2 palindrome = new HomeworkM4_2();
        boolean isIt = palindrome.isPalindrome("Racecars");
        System.out.println("The String is palindrome: " + isIt);
    }

    public boolean isPalindrome(String text) {
        boolean isIt = false;
        if (text == null || text.isEmpty() || text.isBlank()) {
            System.out.println("the String is null or empty");
        } else {
            System.out.println(text);
            String reverse = "";
            int lastLetter = text.length() - 1;
            for (int i = lastLetter; i >= 0; i--) {
                reverse = reverse + text.charAt(i);
            }
            System.out.println(reverse);
            if (text.equalsIgnoreCase(reverse)) {
                isIt = true;
            }
        }
        return isIt;
    }
}













