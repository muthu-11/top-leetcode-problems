package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix prefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix_ShouldReturnEmpty_WhenNoCommonPrefix(){
        assertEquals("", prefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    void longestCommonPrefix_ShouldReturnFirstElement_WhenArrayContainsOneElement(){
        assertEquals("dog", prefix.longestCommonPrefix(new String[]{"dog"}));
    }

    @Test
    void longestCommonPrefix_ShouldReturnCommonPrefix_WhenElementsContainsCommonPrefix(){
        assertAll(
                () -> assertEquals("fl", prefix.longestCommonPrefix(new String[]{"flower","flight","flow"})),
                () -> assertEquals("I want to be a ", prefix.longestCommonPrefix(new String[]
                        {"I want to be a Doctor","I want to be a Software Engineer","I want to be a Musician"}))
        );
    }

}