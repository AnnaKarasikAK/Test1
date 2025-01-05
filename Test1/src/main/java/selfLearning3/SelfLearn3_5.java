package selfLearning3;

public class SelfLearn3_5 {
    public static void main(String[] args) {
        SelfLearn3_5 call = new SelfLearn3_5();
        call.answerCell(false, true, false);
    }

    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isAsleep == true){
            System.out.println("false");
        }
        else if(isMorning == true) {
            if (isMom == true) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else{
                System.out.println("true");
            }
    }
}


