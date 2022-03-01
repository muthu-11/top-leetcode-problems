package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {

    LongestSubstring longestSubstring = new LongestSubstring();

    @Test
    void nonRepeatableMaxLength_ShouldReturnMaxLengthZero_GivenStringNullOrEmpty(){
        assertAll(
                () -> assertEquals(0, longestSubstring.length(null)),
                () -> assertEquals(0, longestSubstring.length(""))
        );
    }

    @Test
    void nonRepeatableMaxLength_ShouldReturnMaxLength_GivenString(){
        assertAll(
                () -> assertEquals(3, longestSubstring.length("abcbbcbc")),
                () -> assertEquals(1, longestSubstring.length("bbbbb")),
                () -> assertEquals(3, longestSubstring.length("pwwkew"))
        );
    }

}