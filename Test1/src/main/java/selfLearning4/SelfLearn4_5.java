package selfLearning4;

public class SelfLearn4_5 {
    public static void main(String[] args) {
        SelfLearn4_5 biggerString = new SelfLearn4_5();
        String result = biggerString.stringTimes("   hellO  ", 3);
        System.out.println(result);
    }

    public String stringTimes(String str, int x){
        String result = "";
        if( str == null || str.isEmpty() || str.isBlank() || x<0) { //int can't be null in java
            System.out.println("The String is null or empty or the int is negative");
        } else {
            for(int i=1; i<=x; i++){
                result = result + str;
            }
        }
        return result;
    }
}
