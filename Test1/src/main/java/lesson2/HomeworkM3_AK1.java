package lesson2;

public class HomeworkM3_AK1 {
    public static void main(String[] args) {
        HomeworkM3_AK1 loops = new HomeworkM3_AK1();
        loops.positiveInt();
    }

    public void positiveInt(){
        for(int i=1; i<=100; i++){
            if(i % 3 == 0){
                if(i % 2 == 0) {
                    System.out.println("The number '" + i + "' is divisible by two and three.");
                }
                else {
                    System.out.println("The number '" + i + "' is divisible by three.");
                }
            }
            else if(i % 2 == 0){
                System.out.println("The number '" + i + "' is even.");
            }
            else{
                System.out.println("The number '" + i + "' is odd.");
            }
        }
    }
}
