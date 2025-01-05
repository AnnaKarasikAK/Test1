package lesson7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBSTRACTION = 4;

    // enum final constants:

    private static final Logger logger = LogManager.getLogger(Calculator.class);



    public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBSTRACTION
    }

    public static double calculate(double a, double b, Type type) {
        logger.info("Running method Calculate");
        double result = 0;
//        if(type == MULTIPLICATION){
//            return a*b;
//        }
        try {
            switch (type) {
                case Type.MULTIPLICATION:
                    result = a * b;
                    break;
                case Type.SUMMARY:
                    result = a + b;
                    break;
                case Type.DIVISION:
                    result = a / b;
                    break;
                case Type.SUBSTRACTION:
                    result = a - b;
                    break;
                default:
                    result = -1;
            }

        }
        catch (Exception err) {
            System.out.println("Something bad happened");
            throw err;
        }
//        finally {
//            System.out.println("Finally block");
//            result = -1;
//
//        }
        return result;
    }
}

