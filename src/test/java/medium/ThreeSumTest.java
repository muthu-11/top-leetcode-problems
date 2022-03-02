package medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    ThreeSum threeSum = new ThreeSum();

    @Test
    void triplets_ShouldReturnEmptyList_WhenArrayLengthIsLessThanThree(){
        assertAll(
                () -> assertEquals(new ArrayList<>(), threeSum.triplets(new int[]{})),
                () -> assertEquals(new ArrayList<>(), threeSum.triplets(new int[]{1})),
                () -> assertEquals(new ArrayList<>(), threeSum.triplets(new int[]{1,2}))
        );
    }

    @Test
    void triplets_ShouldReturnTripletsZero_GivenThreeNumbersZero(){

        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList(0,0,0));
        assertAll(
                () -> assertEquals(expectedList, threeSum.triplets(new int[]{0, 0, 0}))
        );
    }

    @Test
    void triplets_ShouldReturnTripletsZero_GivenFourNumbersZero(){

        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList(0,0,0));
        assertAll(
                () -> assertEquals(expectedList, threeSum.triplets(new int[]{0, 0, 0, 0}))
        );
    }


    @Test
    void triplets_ShouldReturnTripletsList_GivenSumOfThreeNumbersIsZero(){

        assertAll(
                () -> assertEquals(Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1)),
                        threeSum.triplets(new int[]{-1,0,1,2,-1,-4})),
                () -> assertEquals(Arrays.asList(Arrays.asList(-2,0,2), Arrays.asList(-2,1,1)),
                        threeSum.triplets(new int[]{-2,0,1,1,2}))

        );
    }

}