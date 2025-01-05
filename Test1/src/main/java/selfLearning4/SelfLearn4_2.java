package selfLearning4;

public class SelfLearn4_2 {

    public static void main(String[] args) {
        SelfLearn4_2 newWord = new SelfLearn4_2();
        boolean isItMax = newWord.maxStart("  9ax   snacks");
        System.out.println(isItMax);
    }

    public boolean maxStart(String str) {
        boolean isItMax = false;
        if (str == null){
            System.out.println("The String is null");

        } else {
            str = str.trim();
            if(str.length() < 3 || str.isBlank()) {
            System.out.println("The String is empty or too short to begin with 'MAX'");
            }
            else {
                String check = String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(2));
                String ax = "ax";
                if (ax.equalsIgnoreCase(check)) {
                    isItMax = true;
                }
            }
        }return isItMax;
    }
}