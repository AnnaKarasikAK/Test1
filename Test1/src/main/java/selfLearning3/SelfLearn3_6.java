package selfLearning3;

public class SelfLearn3_6 {
    public static void main(String[] args) {
        SelfLearn3_6 slices = new SelfLearn3_6();
        slices.equalSlices(23, 11, 2);
    }

    public void equalSlices(int totalSlices, int numberRecipients, int slicesEach){
        if(numberRecipients*slicesEach <= totalSlices){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
