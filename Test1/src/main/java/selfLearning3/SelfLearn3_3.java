package selfLearning3;

public class SelfLearn3_3 {
    public static void main(String[] args) {
        SelfLearn3_3 largest = new SelfLearn3_3();
        largest.maxInt(5, 19, 40);
    }

    public void maxInt(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
