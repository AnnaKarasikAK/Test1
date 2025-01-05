package selfLearning3;

public class SelfLearn3_2 {
    public static void main(String[] args) {
        SelfLearn3_2 remainder = new SelfLearn3_2();
        remainder.lastDigit(6,11501);
    }

    public void lastDigit(int a, int b){
        if(a%10 == b%10){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
