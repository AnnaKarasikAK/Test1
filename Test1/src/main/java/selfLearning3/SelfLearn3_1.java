package selfLearning3;

public class SelfLearn3_1 {
    public static void main(String[] args) {
        SelfLearn3_1 numbers1 = new SelfLearn3_1();
        numbers1.nearHundred(101);
    }

    public void nearHundred(int n){
        if(n>=10 && n<=100){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}