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

    @Test
    @DisplayName("Test 4 - 1 = 3")
    void test_Subtraction_Success() {
        SimpleMath math = new SimpleMath();
        Double oneSub = math.subtraction(4D, 1D);
        assertEquals(3D, oneSub);
        System.out.println("Test for sub is correct");
    }

    @Test
    @DisplayName("Test 2 x 1 = 2")
    void test_Multiplication_Success() {
        SimpleMath math = new SimpleMath();
        Double oneMult = math.multiplication(2D, 1D);
        assertEquals(2D, oneMult);
        System.out.println("Test for mult is correct");

    }

    @Test
    @DisplayName("Test 15 / 3 = 5")
    void test_Division_Success() {
        SimpleMath math = new SimpleMath();
        Double oneDiv = math.division(15D, 3D);
        assertEquals(5D, oneDiv);
        System.out.println("Test for div is correct");
    }

    @Test
    @DisplayName("Test (5 + 5) / 2 = 5")
    void test_Mean_Success() {
        SimpleMath math = new SimpleMath();
        Double calcMean = math.mean(5D, 5D);
        assertEquals(5D, calcMean);
        System.out.println("Test for mean is correct");
    }

    @Test
    @DisplayName("Test sqrt(16) = 4")
    void test_SquareRoot_Success() {
        SimpleMath math = new SimpleMath();
        Double oneSquare = math.squareRoot(16D);
        assertEquals(4D, oneSquare);
        System.out.println("Test for mean is correct");
    }
}