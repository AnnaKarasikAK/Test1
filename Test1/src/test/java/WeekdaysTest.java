import lesson8.Weekdays;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class WeekdaysTest {

    @ParameterizedTest
    @CsvSource({"2, Monday", "3, Tuesday", "4, Wednesday", "5, Thursday", "6, Friday", "7, Saturday", "1, Sunday"})
    public void positiveTestingForAllWeekdays(int a, String expectedWeekday) {
        String actualWeekday = Weekdays.getDay(a);

        assertEquals(expectedWeekday, actualWeekday);
        assertNotNull(actualWeekday);
    }
    @Test
    public void errorTest(){
        assertThrows(NullPointerException.class, () ->{Weekdays.getDay(null);});
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0, -50, -869573643})
    public void numberLessThanOneTest(int a){
        String expected = "The number should be equal or larger than 1";
        String actualResult = Weekdays.getDay(a);
        assertEquals(expected, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 8, 150, 869573643})
    public void numberMoreThanSevenTest(int a){
        String expected = "The number should be equal or smaller than 7";
        String actualResult = Weekdays.getDay(a);
        assertEquals(expected, actualResult);
    }

}
