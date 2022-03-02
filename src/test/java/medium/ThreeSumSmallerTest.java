package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumSmallerTest {

    ThreeSumSmaller sum = new ThreeSumSmaller();

    @Test
    void smallerSum_ShouldReturnZero_WhenNoSumsLesserThanTarget(){
        assertEquals(0, sum.smallerSum(new int[]{0,0,0},-1));
    }

    @Test
    void smallerSum_ShouldReturnZero_GivenArrayLengthLessThanThree(){
        assertAll(
                () -> assertEquals(0, sum.smallerSum(new int[]{},0)),
                () -> assertEquals(0, sum.smallerSum(new int[]{0},0)),
                () -> assertEquals(0, sum.smallerSum(new int[]{0,0},0))
        );
    }

    @Test
    void smallerSum_ShouldReturnOne_WhenOneTripletSumLesserThanTarget(){
        assertAll(
                () -> assertEquals(1, sum.smallerSum(new int[]{0,0,0}, 1)),
                () -> assertEquals(1, sum.smallerSum(new int[]{0,-2,1,5}, 3))
        );
    }

    @Test
    void smallerSum_ShouldReturnTwo_WhenTwoTripletsSumLesserThanTarget(){
        assertAll(
                () -> assertEquals(2, sum.smallerSum(new int[]{-2,0,1,3}, 2))
        );
    }

}