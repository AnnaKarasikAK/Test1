package selfLearning4;

public class SelfLearn4_1 {
    public static void main(String[] args) {
        SelfLearn4_1 newWord = new SelfLearn4_1();
        String word = newWord.addChars("    ");
        System.out.println(word);
    }

    public String addChars(String str) {
        String word = "";
        if (str.length() > 0 && !str.isBlank()) {
            str = str.trim(); // in case there were spaces before and after the characters
            word = str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
        } else {
            System.out.println("The String is null or empty");
        }
        return word;
    }
}