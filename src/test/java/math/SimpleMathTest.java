package math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    @DisplayName("Test 1 + 3 = 4")
    void test_Sum_Success() {
        SimpleMath math = new SimpleMath();
        Double oneSum = math.sum(1D, 3D);
        assertEquals(4D, oneSum,"The test of sum don't pass :c .");
        System.out.println("Test of sum is correct.");
    }
}