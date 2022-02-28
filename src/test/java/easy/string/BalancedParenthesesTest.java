package easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {

    BalancedParentheses parentheses = new BalancedParentheses();

    @Test
    void isBalanced_ShouldThrowException_GivenAnEmptyString(){
        assertThrows(IllegalArgumentException.class, () -> parentheses.isBalanced(""));
    }

    @DisplayName("Unbalanced Parentheses test cases")
    @ParameterizedTest(name = "TestCase {index} : {0}")
    @CsvSource(value = {"[{()]", "[()]{}{()()]()}", "[()]{}{[()()](}{([])}"})
    void isBalanced_ShouldReturnFalse_GivenNonBalancedString(String s){
        assertFalse(parentheses.isBalanced(s));
    }

    @DisplayName("Balanced Parentheses test cases")
    @ParameterizedTest(name = "TestCase {index} : {0}")
    @CsvSource(value = {"[{()}]", "[()]{}{[()()]()}", "[()]{}{[()()]()}{([])}"})
    void isBalanced_ShouldReturnFalse_GivenBalancedString(String s){
        assertTrue(parentheses.isBalanced(s));
    }
}