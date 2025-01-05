package selfLearning4;

public class SelfLearn4_3 {
    public static void main(String[] args) {
        SelfLearn4_3 surprise = new SelfLearn4_3();
        String result = surprise.fizzString("   Floppy b ");
        System.out.println(result);
    }

    public String fizzString(String str) {
        System.out.println(str);
        String f = "f";
        String b = "b";
        String result = "";
        if (str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("the String is null or empty");
        } else {
            str = str.trim();
            if (f.equalsIgnoreCase(String.valueOf(str.charAt(0))) && b.equalsIgnoreCase(String.valueOf(str.charAt(str.length() - 1)))) {
                result = "FizzBuzz";
            } else if (f.equalsIgnoreCase(String.valueOf(str.charAt(0)))) {
                result = "Fizz";
            } else if (b.equalsIgnoreCase(String.valueOf(str.charAt(str.length() - 1)))) {
                result = "Buzz";
            } else {
                result = "No match was found";
            }
        }
        return result;
    }
}
