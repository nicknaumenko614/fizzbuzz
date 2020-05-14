package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScratchPadTest {

    @Test
    public void oneIsEqualToOne(){

        assertEquals(1,1);
    }
    @Test
    public void additionAdds1And1TogetherToMake2() {
        //action
        int result = addition(1, 1);
        //assertion
        assertEquals(2, result);
    }

    private int addition(int baseNumber, int numberToAdd) {
        return 2;
    }
    @Test
    public void additionAdds10and32TogetherToMake42() {
        int result = addition(10,32);
        assertEquals(42, result);

    }



}
