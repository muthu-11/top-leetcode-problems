package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2Test {

    TwoSum2 twoSum2 = new TwoSum2();

    @Test
    void twoSumIndex_ShouldReturnIndicesArray_GivenArrayOfIntegersAndExistingSumTarget(){
        assertAll(
                () -> assertArrayEquals(new int[]{1,2}, twoSum2.indices(new int[]{2,7,11,15}, 9)),
                () -> assertArrayEquals(new int[]{1,3}, twoSum2.indices(new int[]{2,3,4}, 6)),
                () -> assertArrayEquals(new int[]{1,2}, twoSum2.indices(new int[]{-1,0}, -1))
        );
    }


}