package selfLearning3;

public class SelfLearn3_4 {
    public static void main(String[] args) {
        SelfLearn3_4 seven = new SelfLearn3_4();
        seven.love7(4,7);
    }

    public void love7(int a, int b){
        if(a==7 || b==7 || a+b==7){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
