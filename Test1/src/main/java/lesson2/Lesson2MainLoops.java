package lesson2;

public class Lesson2MainLoops {
    public static void main(String[] args) {
        Lesson2MainLoops loops = new Lesson2MainLoops();
       //loops.countNumbers(1);
        //loops.countNumbers();
        loops.numbersTemplate(10);


    }

    public void countNumbers(int i){

        //System.out.println(i);
        //System.out.println(i+1);

        while (i<=100){
            System.out.println(i);
            i=i+1;
        }

    }
    public void countNumbers(){
        for(int i=1; i<=100; i++){
            System.out.println(i);

        }
    }

    public void numbersTemplate(int rows){
        for(int i=1; i<=rows; i++){
            if(i==7){
                break;
            }
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        }
    }
