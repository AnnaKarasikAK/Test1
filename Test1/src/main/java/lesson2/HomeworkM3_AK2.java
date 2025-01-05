package lesson2;

public class HomeworkM3_AK2 {
    public static void main(String[] args) {
        HomeworkM3_AK2 loops = new HomeworkM3_AK2();
        loops.sumOfNumbers2(5, 2 );
    }

    public void sumOfNumbers2(int a, int b) {
        if (a < b) {
            int sum = a;
            for (a = sum; a < b; sum = sum + a) {
                a++;
            }
            System.out.println(sum);
        } else if (a == b) {
            int sum = a + b;
            System.out.println(sum);
        } else {
            int c = a;
            a = b;
            b = c;
            int sum = a;
            for (a = sum; a < b; sum = sum + a) {
                a++;
            }
            System.out.println(sum);
        }
    }




//   public void sumOfNumbers1(int a, int b){
//        if(a<b) {
//            int sum = a;
//            for (a == a; a < b; a++) {
//                sum = sum + a;
//            }
//            System.out.println(sum);
//        }
//        else if(a==b){
//            int sum = a+b;
//            System.out.println(sum);
//        }
//        else{
//            int c = a;
//            a = b;
//            b = c;
//            int sum = a;
//            while (a < b) {
//                a++;
//                sum = sum + a;
//            }
//            System.out.println(sum);
//        }
//    }
}