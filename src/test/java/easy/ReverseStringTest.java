package easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    ReverseString string = new ReverseString();

    @Test
    void reverseString_ShouldRetainTheOriginalArray_WhenTheCharArrayLengthIsOne(){
        char[] s = new char[]{'a'};
        char[] original = s.clone();
        string.reverseString(s);
        assertArrayEquals(original, s);
    }

    @ParameterizedTest(name = "TestCase {index} : {0}")
    @CsvSource({"ab,ba","abc,cba","hello,olleh", "Hannah,hannaH"})
    void reverseString_ShouldReverseTheOriginalArray_WhenTheCharArrayLengthIsMoreThanOne1(
            @ConvertWith(StringToCharArray.class)char[] input,
            @ConvertWith(StringToCharArray.class)char[] expected){
        string.reverseString(input);
        assertArrayEquals(expected, input);
    }

}

class StringToCharArray extends SimpleArgumentConverter {
    @Override
    protected char[] convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        return ((String) source).toCharArray();
    }
}