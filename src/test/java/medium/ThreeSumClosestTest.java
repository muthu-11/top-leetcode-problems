package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    ThreeSumClosest sum = new ThreeSumClosest();

    @Test
    void closestSum_ShouldReturnZero_WhenAllTheNumbersAreZeroAndAnyTarget(){
        assertEquals(0, sum.closestSumUsing2Pointers(new int[]{0,0,0,0,0}, 10));
    }

    @Test
    void closestSum_ShouldReturnTheClosest_GivenArrayOfNumbersAndTarget(){
        assertAll(
                () -> assertEquals(2, sum.closestSumUsing2Pointers(new int[]{-1,2,1,-4}, 1)),
                () -> assertEquals(-1, sum.closestSumUsing2Pointers(new int[]{1,1,-1,-1,3}, -1)),
                () -> assertEquals(3, sum.closestSumUsing2Pointers(new int[]{0,1,2},0))
        );
    }

}