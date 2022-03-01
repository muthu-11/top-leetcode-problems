package medium.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    ReverseInteger integer = new ReverseInteger();

    @Test
    void reverseInteger_ShouldReturnTheInputNumber_GivenOneDigitNumber(){
        assertEquals(8, integer.reverse(8));
    }

    @Test
    void reverseInteger_ShouldReversedTheNumber_GivenPositiveInteger(){
        assertAll(
                () -> assertEquals(321, integer.reverse(123)),
                () -> assertEquals(987654321, integer.reverse(123456789))
        );
    }

    @Test
    void reverseInteger_ShouldReverseTheNumberWithNegative_GivenNegativeInteger(){
        assertAll(
                () -> assertEquals(-321, integer.reverse(-123)),
                () -> assertEquals(-987654321, integer.reverse(-123456789))
        );
    }

    @Test
    void reverseInteger_ShouldReturnZero_GivenMaxOrMinInteger(){
        assertAll(
                () -> assertEquals(0, integer.reverse(Integer.MAX_VALUE)),
                () -> assertEquals(0, integer.reverse(Integer.MIN_VALUE))
        );

    }
}