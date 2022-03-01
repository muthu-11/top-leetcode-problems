package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    void twoSumIndex_ShouldReturnEmptyArray_GivenEmptyArrayAndTarget(){
        assertArrayEquals(new int[]{}, twoSum.indices(new int[]{}, 7));
    }

    @Test
    void twoSumIndex_ShouldReturnEmptyArray_GivenArrayOfIntegersAndNonExistingSumTarget(){
        assertArrayEquals(new int[]{}, twoSum.indices(new int[]{1,2,3}, 7));
    }

    @Test
    void twoSumIndex_ShouldReturnIndicesArray_GivenArrayOfIntegersAndExistingSumTarget(){
        assertAll(
                () -> assertArrayEquals(new int[]{0,1}, twoSum.indices(new int[]{2,7,11,15}, 9)),
                () -> assertArrayEquals(new int[]{1,2}, twoSum.indices(new int[]{3,2,4}, 6)),
                () -> assertArrayEquals(new int[]{0,1}, twoSum.indices(new int[]{3,3}, 6)),
                () -> assertArrayEquals(new int[]{2,3}, twoSum.indices(new int[]{1,2,3,4,5}, 7))
        );
    }

}