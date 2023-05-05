package com.example.bmi.BodyMassIndex;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BMICalculatorTest {

    @Test
    public void testCalculateBMI() {
        // Create a mock BMICalculator object
        BMICalculator bmiCalculator = mock(BMICalculator.class);

        // Set up the expected input and output values
        double weight = 75.0;
        double height = 1.8;
        double expectedResult = 23.15;

        when(bmiCalculator.calculateBMI(anyDouble(), anyDouble())).thenReturn(expectedResult);

        // Call the method
        double result = bmiCalculator.calculateBMI(weight, height);

        // Verify the result
        assertEquals(expectedResult, result, 0.01);
    }
}
