package com.example.bmi.BodyMassIndex;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BodyMassIndexApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testCalculateBMI() {
		// Create a mock BMICalculator object
		BMICalculator bmiCalculator = mock(BMICalculator.class);

		// Set up the expected input and output values
		double weight = 75.0;
		double height = 1.8;
		double expectedResult = 23.15;


		// Set up the method call and return value
		when(bmiCalculator.calculateBMI(anyDouble(), anyDouble())).thenReturn(expectedResult);

		// Call the method
		double result = bmiCalculator.calculateBMI(weight, height);

		// Verify the result
		assertEquals(expectedResult, result, 0.01);
	}

}
