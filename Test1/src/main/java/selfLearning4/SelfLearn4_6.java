package selfLearning4;

public class SelfLearn4_6 {
    public static void main(String[] args) {
        SelfLearn4_6 isItPlural = new SelfLearn4_6();
        boolean isIt = isItPlural.isPlural("changes    ");
        System.out.println(isIt);
    }

    public boolean isPlural(String str){
        boolean isIt = false;
        if( str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("The String is null or empty");
        } else {
            str = str.trim();
            String plural = "s";
            if(plural.equalsIgnoreCase(String.valueOf(str.charAt(str.length()-1)))){
                isIt = true;
            }
        }
        return isIt;
    }
}
