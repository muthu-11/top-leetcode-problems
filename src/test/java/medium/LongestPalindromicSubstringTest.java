package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring palindrome = new LongestPalindromicSubstring();

    @Test
    void getLongestPalindromicSubstring_ShouldReturnInputString_WhenStringLengthLessThanTwo() {
        assertAll(
                () -> assertEquals("", palindrome.longestPalindrome("")),
                () -> assertEquals("a", palindrome.longestPalindrome("a"))
        );
    }

    @Test
    void getLongestPalindromicSubstring_ShouldReturnLongestPalindrome_GivenString() {
        assertAll(
                () -> assertEquals("bab", palindrome.longestPalindrome("babad")),
                () -> assertEquals("bb", palindrome.longestPalindrome("cbbd"))
        );
    }
}