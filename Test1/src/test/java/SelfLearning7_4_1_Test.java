
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import selfLearning7.SelfLearning7_4_1;

import java.util.Arrays;
import java.util.stream.Stream;


public class SelfLearning7_4_1_Test {

    @Test
    public void notABC(){
        String text = "AaabbNccc";
        String expectedError = "One of the characters is not corresponding to the person";
        String actualError = SelfLearning7_4_1.calculateScores(text);
        assertEquals(expectedError, actualError);
    }

    static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of("", 0, 0, 0),
                Arguments.of("AaBBbbCCCcc", 2, 4, 5),
                Arguments.of("cab", 1, 1, 1),
                Arguments.of("   A a c b A b b AA", 5, 3, 1),
                Arguments.of("      caabbb", 2, 3, 1),
                Arguments.of("ccccccc", 0, 0, 7),
                Arguments.of("     aaaaa    ", 5, 0, 0),
                Arguments.of("bbb     ", 0, 3, 0),
                Arguments.of("a", 1, 0, 0),
                Arguments.of("b", 0, 1, 0),
                Arguments.of("c", 0, 0, 1)

        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void positiveTest(String input, int a, int b, int c){
        int[] expectedResult = {a,b,c};
        String actualResult = SelfLearning7_4_1.calculateScores(input);

        assertEquals(Arrays.toString(expectedResult), actualResult);

    }

}
