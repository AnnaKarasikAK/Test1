package stringsLesson;

public class HomeworkM4_1 {

    public static void main(String[] args) {
        HomeworkM4_1 result = new HomeworkM4_1();
        result.compareStrings();

    }

    public void compareStrings() {
        String a = "at";
        String b = "CAt";

        if (a == null || b == null) {
            System.out.println("Cannot compare Strings - null");
        } else {
            if (!a.isBlank() || !b.isBlank()) {
                // If we want it to be case-sensitive, then the next two lines need to be removed.
                a = a.toLowerCase();
                b = b.toLowerCase();
                if (a.isEmpty() || b.isEmpty()) {
                    System.out.println("Cannot compare Strings - empty");
                } else if (a.isBlank() || b.isBlank()) {
                    System.out.println("Cannot compare Strings - blank");
                } else if (a.equals(b) == true) {
                    System.out.println("equal");
                } else if (a.contains(b) == true) {
                    System.out.println(String.format("%s is a part of %s", b, a));
                } else if (b.contains(a) == true) {
                    System.out.println(String.format("%s is a part of %s", a, b));
                } else {
                    System.out.println("None of these strings contains the other");
                }
            }
        }
    }
}
