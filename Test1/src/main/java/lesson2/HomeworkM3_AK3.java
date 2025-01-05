package lesson2;

public class HomeworkM3_AK3 {
    public static void main(String[] args) {
        HomeworkM3_AK3 loops = new HomeworkM3_AK3();
        loops.numbersTemplate(0);
    }

    public void numbersTemplate(int rows){
        for(int i=rows; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
