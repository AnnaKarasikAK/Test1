package lesson7;

public class Main {
    public static void main(String[] args) {
        double result = Calculator.calculate(2, 3, Calculator.Type.DIVISION);
        System.out.println("Result: " + result);

//        try {
            result = Calculator.calculate(22, 3, null);
            System.out.println("Result: " + result);
//        }
//        catch (Exception err){
//            System.out.println("Something bad happened");
//        }


        result = Calculator.calculate(244, 3, Calculator.Type.SUBSTRACTION);
        System.out.println("Result: " + result);

        result = Calculator.calculate(244, 3, Calculator.Type.DIVISION);
        System.out.println("Result: " + result);

    }
}
