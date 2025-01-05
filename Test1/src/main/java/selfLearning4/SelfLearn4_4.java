package selfLearning4;

public class SelfLearn4_4 {
    public static void main(String[] args) {
        SelfLearn4_4 isThere = new SelfLearn4_4();
        boolean result = isThere.bigThere(" b bobcycle ");
        System.out.println(result);
    }

    public boolean bigThere(String str){
        boolean result = false;
        if (str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("The String is null or empty");
        } else {
            str = str.replaceAll("\\s+","");
            String b = "b";

            for(int i = 0; i <= str.length()-1; i++)  {
                if(i<str.length()-2 && b.equalsIgnoreCase(String.valueOf(str.charAt(i)))){
                    int j=i+2;
                    if(b.equalsIgnoreCase(String.valueOf(str.charAt(j)))) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
