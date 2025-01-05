package lesson1;

public class HomeworkM2_AK1 {
    public static void main(String[] args) {
        // 1.
        String text = "Hello";
        String name = "Anna Karasik";

        System.out.println("1.");
        System.out.println(text);
        System.out.println(name);

        // 2.
        // a. -5 + 8 * 6
        // b. 20 + -3*5 / 8
        int a = -5;
        int b = 8;
        int c = 6;

        int d = 20;
        int e = -3;
        int f = 5;

        double resultB = d+(double)e*f/b;

        System.out.println("2.");
        System.out.println("The result for a. is " + (a+b*c));
        System.out.println("The result for b. is " + resultB);

        // 3.
        double k = 0.1;
        double l = 1.1;
        double m = 3.1415;
        double n = 158.123;
        double o = 0.001;
        String t = " * number ";

        System.out.println("3.");
        System.out.println("Number " + k + t + l + t + m + t + n + t + o + " equals " + k*l*m*n*o);

    }
}
